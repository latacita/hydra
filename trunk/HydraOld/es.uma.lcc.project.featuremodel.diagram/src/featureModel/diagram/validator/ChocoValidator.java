package featureModel.diagram.validator;

import static choco.Choco.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import specializationModel.*;
import specializationModel.Feature;
import tef.project.expressions.*;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.cp.solver.constraints.reified.ExpressionSConstraint;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.kernel.solver.constraints.SConstraint;
import choco.kernel.solver.variables.integer.IntDomainVar;
import featureModel.diagram.edit.statics.CommonCommands;
import gnu.trove.TIntArrayList;


public class ChocoValidator implements ValidatorInterface {
	private Model myModel;
	private Project myProject;
	private String options = "";
	private HashMap<Constraint, String> prettyPretty;
	List<IntegerValueInt> values = new ArrayList<IntegerValueInt>();
	boolean commonalities = true;
	Set<Feature4Validator> referenceFeatures = null;
	private Feature4Validator rootF4V = null;
	private HashMap<String, List<Feature4Validator>> veryImportantList = null;  // :)
	private List<Feature4Validator> setFeatures, deadFeatures;

	public ChocoValidator(Project project, boolean minimice){
		myModel = new CPModel();
		myProject = project;
		if (minimice) options = "cp:objective"; 
		prettyPretty = new HashMap<Constraint, String>();
		referenceFeatures = new HashSet<Feature4Validator>();
		veryImportantList = new HashMap<String, List<Feature4Validator>>();
	}

	public void loadModel(){
		Feature root = getRoot(myProject).get(0);
		TIntArrayList rootDomain = new TIntArrayList();
		rootDomain.add(1);

		IntegerVariable rootVariable = makeIntVar(root.getName(), rootDomain, options);

		rootF4V = new Feature4Validator(root, rootVariable, null, false);
		List<Feature4Validator> listF4V = new ArrayList<Feature4Validator>();
		listF4V.add(rootF4V);
		veryImportantList.put(root.getRealName(), listF4V);
		values.add(new IntegerValueInt(rootVariable));
		myModel.addVariable(rootVariable);
		loadModel(root, rootVariable,  rootF4V);
	}

	public ConfigurationSet getMinConfiguration(){
		Solver s = new CPSolver();
		s.read(myModel);
		s.minimize(false);

		divideCommonalities(s);

		return new ConfigurationSet(setFeatures, deadFeatures, rootF4V);
	}

	public void validate(){
		Solver s = new CPSolver();
		s.read(myModel);
		s.solve();



		if (!s.isFeasible()){			
			List<SConstraint> listOfUnsatisfiedConstraint = new ArrayList<SConstraint>();
			Iterator<SConstraint> itSC =   s.getIntConstraintIterator();
			while (itSC.hasNext()){
				SConstraint sc = itSC.next();

				if (!sc.isSatisfied()) listOfUnsatisfiedConstraint.add(sc);
			}

			System.out.println("Hay "+ listOfUnsatisfiedConstraint.size() + " unsatisfied constraints.");
			for (SConstraint sConstraint: listOfUnsatisfiedConstraint){
				Iterator<Constraint> itFromModel = myModel.getConstraintIterator();
				boolean exit = false;
				while (itFromModel.hasNext() && !exit){
					Constraint constraintFromModel = itFromModel.next();
					SConstraint cc = s.getCstr(constraintFromModel);
					if ( cc instanceof ExpressionSConstraint && ((ExpressionSConstraint) cc).getExtensionnal(s).pretty().equals(sConstraint.pretty())){ 
						System.out.println(prettyPretty.get(constraintFromModel) + " unsatisfied");
						exit = true;
					}else{
						System.out.println(cc.pretty());
					}
				}
				if (!exit) System.out.println(sConstraint.pretty());
			}
			System.out.println("Fin de la primera parte");
		} else {
			while (s.nextSolution());
			
			
			System.out.println("CheckingSolution................................................"  + s.checkSolution(true));

			divideCommonalities(s);

			List<SConstraint> listOfUnsatisfiedConstraint = new ArrayList<SConstraint>();
			Iterator<SConstraint> itSC =   s.getIntConstraintIterator();
			while (itSC.hasNext()){
				SConstraint sc = itSC.next();

				if (!sc.isSatisfied()) listOfUnsatisfiedConstraint.add(sc);
			}

			System.out.println("Hay "+ listOfUnsatisfiedConstraint.size() + " unsatisfied constraints.");
			for (SConstraint sConstraint: listOfUnsatisfiedConstraint){
				Iterator<Constraint> itFromModel = myModel.getConstraintIterator();
				boolean exit = false;
				while (itFromModel.hasNext() && !exit){
					Constraint constraintFromModel = itFromModel.next();
					ExpressionSConstraint cc = (ExpressionSConstraint)s.getCstr(constraintFromModel);
					if ( cc.getExtensionnal(s).pretty().equals(sConstraint.pretty())){ 
						System.out.println(prettyPretty.get(constraintFromModel) + " unsatisfied");
						exit = true;
					}
				}
				if (!exit) System.out.println(sConstraint.pretty());
			}


			System.out.println("Hay " + setFeatures.size() + " elementos comunes");
			for (Feature4Validator f4v : setFeatures){
				System.out.println("Nombre:" + f4v.getName() + " Valor:" + f4v.getValue());
			}

			System.out.println("Hay " + deadFeatures.size() + " dead features");
			for (Feature4Validator f4v : deadFeatures){
				System.out.println("Nombre:" + f4v.getName() + " Valor:" + f4v.getValue());
			}

		}

		int solutions = s.getNbSolutions();
		System.out.println("\n" + rootF4V.toString() + "\n");
		System.out.println("Nb_sol : " + solutions);
	}
	
	public ConfigurationSet getConfigurationSet(){
		return new ConfigurationSet(setFeatures, deadFeatures, rootF4V);
	}

	private void divideCommonalities(Solver s) {
		setFeatures  = new ArrayList<Feature4Validator>();
		deadFeatures  = new ArrayList<Feature4Validator>();
		for (List<Feature4Validator> lf4v : veryImportantList.values()){
			for (Feature4Validator f4v : lf4v){
				IntDomainVar iv = s.getVar(f4v.getIntegerVariable());
				if (iv.getDomainSize() == 1){
					if (iv.getSup() == 0){
						f4v.setValue(0);
						deadFeatures.add(f4v);
					}else{
						f4v.setValue(1);
						setFeatures.add(f4v);
					}
				}
			}
		}
	}

	private Feature4Validator setFeature4Validator(Feature4Validator fatherF4V,	Feature feature, IntegerVariable featureIntegerVariable) {

		Feature4Validator myFeature4Validator = new Feature4Validator(feature, featureIntegerVariable, fatherF4V, false);
		List<Feature4Validator> listF4V;
		listF4V = veryImportantList.get(feature.getRealName());
		if (listF4V == null){ 
			listF4V = new ArrayList<Feature4Validator>();
			listF4V.add(myFeature4Validator);
			veryImportantList.put(feature.getRealName(), listF4V);
		}else{
			listF4V.add(myFeature4Validator);
		}

		return myFeature4Validator;
	}

	private void loadModel(FeatureGroup node, IntegerVariable grandpaValue, Feature4Validator fatherF4V){
		int children = node.getChildren().size();
		int lowerBound = ((FeatureGroup)node).getLowerBound();
		int upperBound = ((FeatureGroup)node).getUpperBound();
		IntegerVariable[] v = new IntegerVariable[children];

		int i = 0;
		for (Feature n : node.getChildren()){
			IntegerVariable iv = makeIntVar(n.getName(), 0,1 , options);
			values.add(new IntegerValueInt(iv));
			myModel.addVariable(iv);

			Feature4Validator myFeature4Validator = setFeature4Validator(fatherF4V, n, iv);

			if (n.getReferences() != null) referenceFeatures.add(myFeature4Validator);
			v[i] = iv;
			i++;

			loadModel(n, iv, myFeature4Validator);
		}
		Constraint aux = ifThenElse(
				gt(grandpaValue,0),
				and(geq(sum(v), mult(lowerBound,grandpaValue )), leq(sum(v), mult(upperBound,grandpaValue))),
				eq(sum(v), 0));
		prettyPretty.put(aux, "Correct values of FG with childs " + node.getChildren().toString());
		myModel.addConstraint(aux);
	}

	private void loadModel(Feature mainFeature, IntegerVariable featureValue, Feature4Validator fatherF4V){
		Constraint aux;

		Feature feature = mainFeature.getReferences();
		if (feature != null){
			loadModel(feature, featureValue, fatherF4V);
		}else{

			for (Object n : mainFeature.getChildren()){
				if (n instanceof Feature){
					IntegerVariable v = null;
					Relation r = CommonCommands.getRelationTo(myProject, (Node) n);

					if ( r instanceof RelationFeature){
						int lowerBound = ((RelationFeature)r).getLowerBound();
						int upperBound = ((RelationFeature)r).getUpperBound();
						for (int i = 0; i < lowerBound; i++){
							// crear variables y restricciones mandatory
							createFeatureMandatory(featureValue, fatherF4V, (Feature) n, r);
						}
						for (int i = lowerBound; i < upperBound; i++){
							// crear variables y restricciones opcionales
							createFeatureOptional(featureValue, fatherF4V, (Feature) n, r);
						}
					}

				}else if (n instanceof FeatureGroup){
					loadModel((FeatureGroup) n,featureValue, fatherF4V);
				}
			}
		}
	}

	private void checkStateFeature(Feature feature, IntegerVariable integerVariable){
		Constraint aux;
		switch (feature.getState().getValue()){
		case ConfigState.USER_SELECTED_VALUE:
			aux = eq(integerVariable,1);
			prettyPretty.put(aux, feature.getName() + " = 1");
			myModel.addConstraint(aux);
			break;
		case ConfigState.USER_ELIMINATED_VALUE:
			aux = eq(integerVariable,0);
			prettyPretty.put(aux, feature.getName() + " = 0");
			myModel.addConstraint(aux);
			break;
		}
	}

	private void createFeatureOptional(IntegerVariable featureValue,
			Feature4Validator fatherF4V, Feature feature, Relation r) {
		Constraint aux;
		IntegerVariable v;
		v= makeIntVar(feature.getName(), 0,1, options);
		checkStateFeature(feature, v);
		values.add(new IntegerValueInt(v));
		myModel.addVariable(v);
		Feature4Validator myFeature4Validator = setFeature4Validator(fatherF4V, feature, v); 
		if ( feature.getReferences() != null) referenceFeatures.add(myFeature4Validator);

		switch (feature.getState().getValue()){
		case ConfigState.USER_SELECTED_VALUE:
			aux = gt(v,0);
			prettyPretty.put(aux, feature.getName() + " > 0");
			myModel.addConstraint(aux);
			break;
		case ConfigState.USER_ELIMINATED_VALUE:
			aux = eq(v,0);
			prettyPretty.put(aux, feature.getName() + " = 0");
			myModel.addConstraint(aux);
			break;
		}
		aux = ifThenElse(eq(featureValue, 0), 
				eq(v, 0), 
				and(geq(v, 0), leq(v, 1)));
		prettyPretty.put(aux, feature.getName() + " implies " + ((Feature) feature.getFather()).getName());
		myModel.addConstraint( aux);
		loadModel(feature, v, myFeature4Validator);
	}

	private void createFeatureMandatory(IntegerVariable featureValue,
			Feature4Validator fatherF4V, Feature feature, Relation r) {
		Constraint aux;
		IntegerVariable v;
		v= makeIntVar(feature.getName(), 0,1, options);
		checkStateFeature(feature, v);
		values.add(new IntegerValueInt(v));
		myModel.addVariable(v);
		Feature4Validator myFeature4Validator = setFeature4Validator(fatherF4V, feature, v); 
		if ( feature.getReferences() != null) referenceFeatures.add(myFeature4Validator);

		switch (feature.getState().getValue()){
		case ConfigState.USER_SELECTED_VALUE:
			aux = eq(v,1);
			prettyPretty.put(aux, feature.getName() + " = 1");
			myModel.addConstraint(aux);
			break;
		case ConfigState.USER_ELIMINATED_VALUE:
			aux = eq(v,0);
			prettyPretty.put(aux, feature.getName() + " = 0");
			myModel.addConstraint(aux);
			break;
		}
		aux = eq(featureValue, v);
		prettyPretty.put(aux, feature.getName() + " = " + ((Feature) feature.getFather()).getName());
		myModel.addConstraint(aux); 
		loadModel(feature, v, myFeature4Validator);
	}

	private List<Feature> getRoot(Project myModel){
		boolean salir = false;
		Node temp;
		List<Feature> res = new ArrayList<Feature>();

		for (Node node : myModel.getFeatures()){
			if (node instanceof Feature && node.getFather() == null){
				res.add((Feature)node);
			}
		}
		return res;
	}

	public void setFeature(String featureName){
		List<Feature4Validator> listOfFeature = veryImportantList.get(featureName);

		if (listOfFeature != null){
			for (Feature4Validator f4v : listOfFeature){
				Constraint aux = eq(f4v.getIntegerVariable(), 1);
				prettyPretty.put(aux, f4v.getName() + " = 1");
				myModel.addConstraint(aux);
			}
		}

	}

	public void loadUserConstraints(tef.project.expressions.Model userConstraints) {
		// TODO Auto-generated method stub		
		for (Object e : userConstraints.getConstraints()){
			if (e instanceof Expression){
				List<String> affectedFeatures = getNames((Expression) e);

				// who have more elements?
				String greater = whoIsGreater(affectedFeatures);

				if (greater != null){
					Set<Feature4Validator> roots = new HashSet<Feature4Validator>();
					for (Feature4Validator f4v :veryImportantList.get(greater)){
						Feature4Validator temporalyChosen = f4v;
						for (String s : affectedFeatures){
							if (!s.equals(greater)){
								List<Feature4Validator> allSameName = veryImportantList.get(s);
								if (allSameName != null) temporalyChosen = temporalyChosen.leastCommonFatherWithTheNearestFeature(allSameName);
							}
						}
						roots.add(temporalyChosen);
					}

					HashMap<Feature4Validator, HashMap<String, List<Feature4Validator>>> subTrees = new HashMap<Feature4Validator, HashMap<String, List<Feature4Validator>>>();

					for (Feature4Validator f4v : roots){
						HashMap<String, List<Feature4Validator>> hashmap = new HashMap<String, List<Feature4Validator>>();
						for (String s: affectedFeatures){
							hashmap.put(s, new ArrayList<Feature4Validator>());
						}
						subTrees.put(f4v, hashmap);
					}

					for (String s: affectedFeatures){
						if (veryImportantList.containsKey(s)){
							for (Feature4Validator f4v : veryImportantList.get(s)){
								Iterator<Feature4Validator> it = roots.iterator();
								boolean exit = false;

								while (it.hasNext() && !exit){
									Feature4Validator proposedRoot = it.next();
									if ( f4v.getAntecesors().contains(proposedRoot)){
										exit = true;
										subTrees.get(proposedRoot).get(s).add(f4v);
									}
								}
							}
						}
					}
					for (HashMap<String, List<Feature4Validator>> subTree : subTrees.values()){
						PrettyConstraint pc = transformToConstraint((Expression)e, subTree);
						prettyPretty.put(pc.getMyConstraint(), pc.getMyString());
						myModel.addConstraint(pc.getMyConstraint());
						System.out.println(pc.getMyString());
						System.out.println(pc.getMyConstraint().pretty());
					}
				}else{
					PrettyConstraint pc = transformToConstraint((Expression)e, new HashMap<String, List<Feature4Validator>>());
					prettyPretty.put(pc.getMyConstraint(), pc.getMyString());
					myModel.addConstraint(pc.getMyConstraint());
				}
			}
		}


	}

	private String whoIsGreater(List<String> names){
		int actualSize = 0;
		String result = null;

		for (String s : names){
			if (veryImportantList.containsKey(s) && veryImportantList.get(s).size() > actualSize){ 
				result = s;
				actualSize = veryImportantList.get(s).size();
			}
		}
		return result;
	}

	private IntegerVariable[] getAllNamed(String name, HashMap<String, List<Feature4Validator>> searchHere){
		List<IntegerVariable> result = new ArrayList<IntegerVariable>();

		IntegerVariable zeroIntegerVariable = constant(0);
		result.add(zeroIntegerVariable);

		List<Feature4Validator> listOfF4VWithSameNameAndInTheSameSubTree = searchHere.get(name);

		if (listOfF4VWithSameNameAndInTheSameSubTree != null){
			for (Feature4Validator f4v : listOfF4VWithSameNameAndInTheSameSubTree){
				result.add(f4v.getIntegerVariable()); 
			}
		}
		int size = result.size();
		IntegerVariable[] integerArray = new IntegerVariable[size];
		int i = 0;
		for ( IntegerVariable iv : result){
			integerArray[i] = iv;
			i++;
		}

		return integerArray;
	}

	private List<String> getNames(Expression e){
		List<String> names = new ArrayList<String>();

		if ( e instanceof BinaryOperator){
			names.addAll(getNames(((BinaryOperator)e).getOp1()));
			names.addAll(getNames(((BinaryOperator)e).getOp2()));
		}else if (e instanceof ComparisonOperator){
			names.addAll(getNames(((ComparisonOperator)e).getOp1()));
			names.addAll(getNames(((ComparisonOperator)e).getOp2()));
		}else if (e instanceof UnaryOperator){
			names.addAll(getNames(((UnaryOperator)e).getOp()));
		}else if (e instanceof QuantifyOperator){
			names.add(((QuantifyOperator) e).getOp().getName());
		}else if (e instanceof tef.project.expressions.Feature){
			names.add(((tef.project.expressions.Feature)e).getName());
		} else if (e instanceof ComparisonOperand){
			names.add(((QuantifyOperator) e).getOp().getName());
		}
		return names;
	}

	private PrettyConstraint transformToConstraint(Expression e, HashMap<String, List<Feature4Validator>> envolvedFeatures) {
		// TODO Auto-generated method stub

		PrettyConstraint result = null;

		if ( e instanceof BinaryOperator){
			PrettyConstraint op1 = transformToConstraint(((BinaryOperator)e).getOp1(), envolvedFeatures);
			PrettyConstraint op2 = transformToConstraint(((BinaryOperator)e).getOp2(), envolvedFeatures);

			if (e instanceof Implies){
				result = new PrettyConstraint(implies(op1.getMyConstraint(), op2.getMyConstraint()), op1.getMyString() + " implies " + op2.getMyString());
			}else if (e instanceof Or){
				result = new PrettyConstraint(or(op1.getMyConstraint(), op2.getMyConstraint()), op1.getMyString() + " or " + op2.getMyString());
			}else if (e instanceof And){	
				result = new PrettyConstraint(and(op1.getMyConstraint(), op2.getMyConstraint()), op1.getMyString() + " and " + op2.getMyString());
			}
		}else if (e instanceof ComparisonOperator){
			PrettyConstraint op11 = transformToConstraint(((ComparisonOperator)e).getOp1(), envolvedFeatures);
			PrettyConstraint op22 = transformToConstraint(((ComparisonOperator)e).getOp2(), envolvedFeatures);

			PrettyIEV op1 = getIntValue(((ComparisonOperator)e).getOp1(), envolvedFeatures);
			PrettyIEV op2 = getIntValue(((ComparisonOperator)e).getOp2(), envolvedFeatures); 
			if (e instanceof LE){
				result = new PrettyConstraint(leq(op1.getIev(), op2.getIev()), op1.getString() + " <= " + op2.getString());
			}else if (e instanceof G){
				result = new PrettyConstraint(gt(op1.getIev(), op2.getIev()), op1.getString() + " > " + op2.getString());
			}else if (e instanceof GE){
				result = new PrettyConstraint(geq(op1.getIev(), op2.getIev()), op1.getString() + " >= " + op2.getString());
			}else if (e instanceof L){
				result = new PrettyConstraint(lt(op1.getIev(), op2.getIev()), op1.getString() + " < " + op2.getString());
			}else if (e instanceof E) {
				result = new PrettyConstraint(eq(op1.getIev(), op2.getIev()), op1.getString() + " = " + op2.getString());
			}else if (e instanceof D) {
				result = new PrettyConstraint(neq(op1.getIev(), op2.getIev()), op1.getString() + " != " + op2.getString());
			}
		}else if (e instanceof UnaryOperator){
			PrettyConstraint op = transformToConstraint(((UnaryOperator)e).getOp(), envolvedFeatures);

			if ( e instanceof Neg){
				result = new PrettyConstraint(not(op.getMyConstraint()), "not " + op.myString);
			}
		}else if (e instanceof QuantifyOperator){
			String name = ((QuantifyOperator) e).getOp().getName();
			IntegerVariable[] sameNameVariable = getAllNamed(name, envolvedFeatures);

			if ( e instanceof tef.project.expressions.Number){
				result = new PrettyConstraint(eq(sum(sameNameVariable), ((tef.project.expressions.Number) e).getValue()), new Integer(((tef.project.expressions.Number) e).getValue()) + name );
			}else if (e instanceof All){
				result = new PrettyConstraint(eq(sum(sameNameVariable), sameNameVariable.length -1), "all " + name);
			}else if (e instanceof Any){
				result = new PrettyConstraint(gt(sum(sameNameVariable), 0), " any " + name);
			}
		}else if (e instanceof tef.project.expressions.Feature){
			String name = ((tef.project.expressions.Feature)e).getName();
			IntegerVariable[] sameNameVariable = getAllNamed(name, envolvedFeatures);

			result = new PrettyConstraint(gt(sum(sameNameVariable), 0), name);
		} else if (e instanceof ComparisonOperand){
			String name = ((QuantifyOperator) e).getOp().getName();
			IntegerVariable[] sameNameVariable = getAllNamed(name, envolvedFeatures);

			if ( e instanceof tef.project.expressions.Number){
				result = new PrettyConstraint(eq(sum(sameNameVariable), ((tef.project.expressions.Number) e).getValue()), new Integer(((tef.project.expressions.Number) e).getValue()) + name );
			}else if (e instanceof All){
				result = new PrettyConstraint(eq(sum(sameNameVariable), sameNameVariable.length), "all " + name);
			}else if (e instanceof Any){
				result = new PrettyConstraint(gt(sum(sameNameVariable), 0), " any " + name);
			}
		}


		return result;
	}

	private PrettyIEV getIntValue(ComparisonOperand op, HashMap<String, List<Feature4Validator>> envolvedFeatures) {
		// TODO Auto-generated method stub
		IntegerExpressionVariable value = null;
		String prettyPhrase = "";

		if (op instanceof Quantity){
			int intValue = ((Quantity)op).getValue();
			value = constant(intValue);
			prettyPhrase = new Integer(intValue).toString();
		}else if (op instanceof Function){
			String name = ((tef.project.expressions.Feature)((Function)op).getOp()).getName();
			IntegerVariable[] sameNameVariable = getAllNamed(name, envolvedFeatures);

			if (op instanceof Count){
				value = sum(sameNameVariable);
				prettyPhrase = " count " + name ;
			}
		}

		return new PrettyIEV(value, prettyPhrase);
	}

	public Feature4Validator getRootF4V() {
		return rootF4V;
	}

	public List<Feature4Validator> getSetFeatures() {
		return setFeatures;
	}

	public List<Feature4Validator> getDeadFeatures() {
		return deadFeatures;
	}

}
