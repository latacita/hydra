package featureModel.diagram.validator;

import static choco.Choco.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import featureModel.*;
import tef.project.expressions.All;
import tef.project.expressions.And;
import tef.project.expressions.Any;
import tef.project.expressions.BinaryOperator;
import tef.project.expressions.ComparisonOperand;
import tef.project.expressions.ComparisonOperator;
import tef.project.expressions.Count;
import tef.project.expressions.D;
import tef.project.expressions.E;
import tef.project.expressions.Expression;
import tef.project.expressions.Function;
import tef.project.expressions.G;
import tef.project.expressions.GE;
import tef.project.expressions.Implies;
import tef.project.expressions.L;
import tef.project.expressions.LE;
import tef.project.expressions.Neg;
import tef.project.expressions.Or;
import tef.project.expressions.QuantifyOperator;
import tef.project.expressions.Quantity;
import tef.project.expressions.UnaryOperator;

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


public class ChocoValidatorFM implements ValidatorInterface{
	private Model myModel;
	private Project myProject;
	private String options = "";
	private HashMap<Constraint, String> prettyPretty;
	List<IntegerValueInt> values = new ArrayList<IntegerValueInt>();
	boolean commonalities = false;
	Set<Feature4ValidatorFM> referenceFeatures = null;
	private Feature4ValidatorFM rootF4V = null;
	private HashMap<String, List<Feature4ValidatorFM>> veryImportantList = null;  // :)
	private List<Feature4ValidatorFM> setFeatures, deadFeatures;
	
	public ChocoValidatorFM(Project project, boolean minimice){
		myModel = new CPModel();
		myProject = project;
		if (minimice) options = "cp:objective"; 
		prettyPretty = new HashMap<Constraint, String>();
		referenceFeatures = new HashSet<Feature4ValidatorFM>();
		veryImportantList = new HashMap<String, List<Feature4ValidatorFM>>();
	}

	public void loadModel(){
		Feature root = getRoot(myProject).get(0);
		TIntArrayList rootDomain = new TIntArrayList();
		rootDomain.add(1);

		IntegerVariable rootVariable = makeIntVar(root.getName(), rootDomain, options);

		rootF4V = new Feature4ValidatorFM(root, rootVariable, null, false);
		List<Feature4ValidatorFM> listF4V = new ArrayList<Feature4ValidatorFM>();
		listF4V.add(rootF4V);
		veryImportantList.put(root.getName(), listF4V);
		values.add(new IntegerValueInt(rootVariable));
		myModel.addVariable(rootVariable);
		loadModel(root, rootVariable, rootF4V);
	}


	public ConfigurationSetFM getMinConfiguration(){
		Solver s = new CPSolver();
		s.read(myModel);
		s.minimize(false);
		
		divideCommonalities(s);
		return new ConfigurationSetFM(setFeatures, deadFeatures, rootF4V);
	}

	public void validate(){
		Solver s = new CPSolver();
		s.read(myModel);
		s.solveAll();
		//		s.solve();



		if (!s.isFeasible()){
			System.out.println("CheckingSolution................................................"  + s.checkSolution(true));

			Iterator<SConstraint> itSC =   s.getIntConstraintIterator();
			Iterator<Constraint> it = myModel.getConstraintIterator();
			while (itSC.hasNext()){
				SConstraint sc = itSC.next();
				Constraint w = it.next();
				SConstraint sc2 = s.getCstr(w);
				System.out.println(sc2.hashCode() + "   " + sc.hashCode());
				System.out.println(sc.pretty() + " " + sc.isSatisfied());

				//				System.out.println("Checking: " + c.pretty());
				try {
					System.out.println("Checking rule: " + prettyPretty.get(w) +"    ...... " + sc2.isSatisfied());
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
			} 
		} else {
			System.out.println("CheckingSolution................................................"  + s.checkSolution(true));

			divideCommonalities(s);
			
			//			do {
			//				if (commonalities){
			//					Iterator<IntegerValueInt> it = values.iterator();
			//					while (it.hasNext()){
			//						IntegerValueInt ivi =  it.next();
			//						int var = s.getVar(ivi.getIntegerValue()).getVal();
			//						System.out.println("Name : " + ivi.getIntegerValue().getName() + " Value: " + var);
			//						if (ivi.isSet() && !ivi.isTheSameValue(var)) it.remove();
			//						else if (!ivi.isSet() || ivi.getValue() > var) ivi.setValue(var);
			//					}
			//					System.out.println("\n");
			//				}else{
			//					for(IntegerValueInt ivi : values){
			//						IntegerVariable iv = ivi.getIntegerValue();
			//						System.out.println("Valor var : " + iv.pretty() + " val : " + s.getVar(iv));
			//					}
			//					System.out.println("\n");
			//				}
			//			}while (s.nextSolution());


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
					//					System.out.println(cc.getExtensionnal(s).pretty() + "  " + sConstraint.pretty());
					if ( cc.getExtensionnal(s).pretty().equals(sConstraint.pretty())){ 
						System.out.println(prettyPretty.get(constraintFromModel) + " unsatisfied");
						exit = true;
					}
				}
				if (!exit) System.out.println(sConstraint.pretty());
			}





			//			Iterator<Constraint> it = myModel.getConstraintIterator();
			//			while (itSC.hasNext()){
			//				SConstraint sc = itSC.next();
			//				Constraint w = it.next();
			//				//				System.out.println("Checking: " + c.pretty());
			//				//				System.out.println("Checking rule: " + w.pretty() +"    ...... " + sc.isSatisfied());
			//				System.out.println("Checking rule: " + prettyPretty.get(w) +"    ...... " + sc.isSatisfied());
			//			} 


			//			Iterator<IntegerVariable> it1 = myModel.getIntVarIterator();
			//			while(it1.hasNext()){
			//				IntegerVariable iv = it1.next();
			//				System.out.println("Valor var : " + iv.pretty()+ " val : " + s.getVar(iv));
			//			}	
		}

		int solutions = s.getNbSolutions();

		System.out.println("Nb_sol : " + solutions);

	}

	private void divideCommonalities(Solver s) {
		setFeatures  = new ArrayList<Feature4ValidatorFM>();
		deadFeatures  = new ArrayList<Feature4ValidatorFM>();
		for (List<Feature4ValidatorFM> lf4v : veryImportantList.values()){
			for (Feature4ValidatorFM f4v : lf4v){
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
	
	private Feature4ValidatorFM setFeature4ValidatorFM(Feature4ValidatorFM fatherF4V,	Feature feature, IntegerVariable featureIntegerVariable) {

		Feature4ValidatorFM myFeature4Validator = new Feature4ValidatorFM(feature, featureIntegerVariable, fatherF4V, false);
		List<Feature4ValidatorFM> listF4V;
		listF4V = veryImportantList.get(feature.getName());
		if (listF4V == null){ 
			listF4V = new ArrayList<Feature4ValidatorFM>();
			listF4V.add(myFeature4Validator);
			veryImportantList.put(feature.getName(), listF4V);
		}else{
			listF4V.add(myFeature4Validator);
		}

		return myFeature4Validator;
	}

	private void loadModel(FeatureGroup node, IntegerVariable grandpaValue,  Feature4ValidatorFM fatherF4V){
		int children = node.getChildren().size();
		int lowerBound = ((FeatureGroup)node).getLowerBound();
		int upperBound = ((FeatureGroup)node).getUpperBound();
		IntegerVariable[] v = new IntegerVariable[children];

		int i = 0;
		for (Feature n : node.getChildren()){
			IntegerVariable iv = makeIntVar(n.getName(), 0,1, options);
			values.add(new IntegerValueInt(iv));
			myModel.addVariable(iv);

			Feature4ValidatorFM myFeature4Validator = setFeature4ValidatorFM(fatherF4V, n, iv);

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

	private void loadModel(Feature mainFeature, IntegerVariable featureValue, Feature4ValidatorFM fatherF4V){
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

	private void createFeatureOptional(IntegerVariable featureValue,
			Feature4ValidatorFM fatherF4V, Feature feature, Relation r) {
		Constraint aux;
		IntegerVariable v;
		v= makeIntVar(feature.getName(), 0,1, options);
		values.add(new IntegerValueInt(v));
		myModel.addVariable(v);
		Feature4ValidatorFM myFeature4ValidatorFM = setFeature4ValidatorFM(fatherF4V, feature, v); 
		if ( feature.getReferences() != null) referenceFeatures.add(myFeature4ValidatorFM);

		aux = ifThenElse(eq(featureValue, 0), 
				eq(v, 0), 
				and(geq(v, 0), leq(v, 1)));
		prettyPretty.put(aux, feature.getName() + " implies " + ((Feature) feature.getFather()).getName());
		myModel.addConstraint( aux);
		loadModel(feature, v, myFeature4ValidatorFM);
	}

	private void createFeatureMandatory(IntegerVariable featureValue,
			Feature4ValidatorFM fatherF4V, Feature feature, Relation r) {
		Constraint aux;
		IntegerVariable v;
		v= makeIntVar(feature.getName(), 0,1, options);
		values.add(new IntegerValueInt(v));
		myModel.addVariable(v);
		Feature4ValidatorFM myFeature4ValidatorFM = setFeature4ValidatorFM(fatherF4V, feature, v); 
		if ( feature.getReferences() != null) referenceFeatures.add(myFeature4ValidatorFM);

		aux = eq(featureValue, v);
		prettyPretty.put(aux, feature.getName() + " = " + ((Feature) feature.getFather()).getName());
		myModel.addConstraint(aux); 
		loadModel(feature, v, myFeature4ValidatorFM);
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
		List<Feature4ValidatorFM> listOfFeature = veryImportantList.get(featureName);
		
		if (listOfFeature != null){
			for (Feature4ValidatorFM f4v : listOfFeature){
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
					Feature4ValidatorFM temporalyChosen = veryImportantList.get(greater).get(0);
					Feature4ValidatorFM lcF = null;
					for (String s : affectedFeatures){
						if (!s.equals(greater)){
							List<Feature4ValidatorFM> allSameName = veryImportantList.get(s);
							if (allSameName != null) temporalyChosen = temporalyChosen.leastCommonFatherWithTheNearestFeature(allSameName);
						}
					}

					// in theory, temporalyChosen.getRealName() is the root of each subtree domain

					List<Feature4ValidatorFM> roots = veryImportantList.get(temporalyChosen.getName());

					HashMap<Feature4ValidatorFM, HashMap<String, List<Feature4ValidatorFM>>> subTrees = new HashMap<Feature4ValidatorFM, HashMap<String, List<Feature4ValidatorFM>>>();

					for (Feature4ValidatorFM f4v : roots){
						HashMap<String, List<Feature4ValidatorFM>> hashmap = new HashMap<String, List<Feature4ValidatorFM>>();
						for (String s: affectedFeatures){
							hashmap.put(s, new ArrayList<Feature4ValidatorFM>());
						}
						subTrees.put(f4v, hashmap);
					}

					for (String s: affectedFeatures){
						if (veryImportantList.containsKey(s)){
							for (Feature4ValidatorFM f4v : veryImportantList.get(s)){
								Iterator<Feature4ValidatorFM> it = roots.iterator();
								boolean exit = false;

								while (it.hasNext() && !exit){
									Feature4ValidatorFM proposedRoot = it.next();
									if ( f4v.getAntecesors().contains(proposedRoot)){
										exit = true;
										subTrees.get(proposedRoot).get(s).add(f4v);
									}
								}
							}
						}
					}
					for (HashMap<String, List<Feature4ValidatorFM>> subTree : subTrees.values()){
						PrettyConstraint pc = transformToConstraint((Expression)e, subTree);
						prettyPretty.put(pc.getMyConstraint(), pc.getMyString());
						myModel.addConstraint(pc.getMyConstraint());
					}
				}else{
					PrettyConstraint pc = transformToConstraint((Expression)e, new HashMap<String, List<Feature4ValidatorFM>>());
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

	private IntegerVariable[] getAllNamed(String name, HashMap<String, List<Feature4ValidatorFM>> searchHere){
		List<IntegerVariable> result = new ArrayList<IntegerVariable>();

		IntegerVariable zeroIntegerVariable = constant(0);
		result.add(zeroIntegerVariable);

		List<Feature4ValidatorFM> listOfF4VWithSameNameAndInTheSameSubTree = searchHere.get(name);

		for (Feature4ValidatorFM f4v : listOfF4VWithSameNameAndInTheSameSubTree){
			result.add(f4v.getIntegerVariable()); 
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
//		} else if (e instanceof ComparisonOperand){
//			names.add(((ComparisonOperand) e).getOp().getName());
		}
		return names;
	}

	private PrettyConstraint transformToConstraint(Expression e, HashMap<String, List<Feature4ValidatorFM>> envolvedFeatures) {
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
				result = new PrettyConstraint(eq(sum(sameNameVariable), sameNameVariable.length), "all " + name);
			}else if (e instanceof Any){
				result = new PrettyConstraint(gt(sum(sameNameVariable), 0), " any " + name);
			}
		}else if (e instanceof tef.project.expressions.Feature){
			String name = ((tef.project.expressions.Feature)e).getName();
			IntegerVariable[] sameNameVariable = getAllNamed(name, envolvedFeatures);

			result = new PrettyConstraint(gt(sum(sameNameVariable), 0), name);
//		} else if (e instanceof ComparisonOperand){
//			String name = ((QuantifyOperator) e).getOp().getName();
//			IntegerVariable[] sameNameVariable = getAllNamed(name, envolvedFeatures);
//
//			if ( e instanceof tef.project.expressions.Number){
//				result = new PrettyConstraint(eq(sum(sameNameVariable), ((tef.project.expressions.Number) e).getValue()), new Integer(((tef.project.expressions.Number) e).getValue()) + name );
//			}else if (e instanceof All){
//				result = new PrettyConstraint(eq(sum(sameNameVariable), sameNameVariable.length), "all " + name);
//			}else if (e instanceof Any){
//				result = new PrettyConstraint(gt(sum(sameNameVariable), 0), " any " + name);
//			}
		}


		return result;
	}

	private PrettyIEV getIntValue(ComparisonOperand op, HashMap<String, List<Feature4ValidatorFM>> envolvedFeatures) {
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

}
