/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractHydraConstInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<hydraconstraints.resource.hydraConst.IHydraConstInterpreterListener> listeners = new java.util.ArrayList<hydraconstraints.resource.hydraConst.IHydraConstInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof hydraconstraints.Number) {
			result = interprete_hydraconstraints_Number((hydraconstraints.Number) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.All) {
			result = interprete_hydraconstraints_All((hydraconstraints.All) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Any) {
			result = interprete_hydraconstraints_Any((hydraconstraints.Any) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Selection) {
			result = interprete_hydraconstraints_Selection((hydraconstraints.Selection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Context) {
			result = interprete_hydraconstraints_Context((hydraconstraints.Context) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.SimpleFeature) {
			result = interprete_hydraconstraints_SimpleFeature((hydraconstraints.SimpleFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.BoolOperandChoices) {
			result = interprete_hydraconstraints_BoolOperandChoices((hydraconstraints.BoolOperandChoices) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.MultipleFeature) {
			result = interprete_hydraconstraints_MultipleFeature((hydraconstraints.MultipleFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.NumOperandChoices) {
			result = interprete_hydraconstraints_NumOperandChoices((hydraconstraints.NumOperandChoices) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Div) {
			result = interprete_hydraconstraints_Div((hydraconstraints.Div) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Minus) {
			result = interprete_hydraconstraints_Minus((hydraconstraints.Minus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Mul) {
			result = interprete_hydraconstraints_Mul((hydraconstraints.Mul) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Plus) {
			result = interprete_hydraconstraints_Plus((hydraconstraints.Plus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.NumOperator) {
			result = interprete_hydraconstraints_NumOperator((hydraconstraints.NumOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.NumPriorityOperand1) {
			result = interprete_hydraconstraints_NumPriorityOperand1((hydraconstraints.NumPriorityOperand1) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.NumPriorityOperand2) {
			result = interprete_hydraconstraints_NumPriorityOperand2((hydraconstraints.NumPriorityOperand2) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.NumOperand) {
			result = interprete_hydraconstraints_NumOperand((hydraconstraints.NumOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.LessOrEqual) {
			result = interprete_hydraconstraints_LessOrEqual((hydraconstraints.LessOrEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Equal) {
			result = interprete_hydraconstraints_Equal((hydraconstraints.Equal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Less) {
			result = interprete_hydraconstraints_Less((hydraconstraints.Less) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.NotEqual) {
			result = interprete_hydraconstraints_NotEqual((hydraconstraints.NotEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.MoreOrEqual) {
			result = interprete_hydraconstraints_MoreOrEqual((hydraconstraints.MoreOrEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.More) {
			result = interprete_hydraconstraints_More((hydraconstraints.More) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Comparison) {
			result = interprete_hydraconstraints_Comparison((hydraconstraints.Comparison) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Xor) {
			result = interprete_hydraconstraints_Xor((hydraconstraints.Xor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Implies) {
			result = interprete_hydraconstraints_Implies((hydraconstraints.Implies) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Or) {
			result = interprete_hydraconstraints_Or((hydraconstraints.Or) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.And) {
			result = interprete_hydraconstraints_And((hydraconstraints.And) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.BinaryOp) {
			result = interprete_hydraconstraints_BinaryOp((hydraconstraints.BinaryOp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Neg) {
			result = interprete_hydraconstraints_Neg((hydraconstraints.Neg) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.UnaryOp) {
			result = interprete_hydraconstraints_UnaryOp((hydraconstraints.UnaryOp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.LogicalOperator) {
			result = interprete_hydraconstraints_LogicalOperator((hydraconstraints.LogicalOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.BoolPriorityOperand2) {
			result = interprete_hydraconstraints_BoolPriorityOperand2((hydraconstraints.BoolPriorityOperand2) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.BoolPriorityOperand1) {
			result = interprete_hydraconstraints_BoolPriorityOperand1((hydraconstraints.BoolPriorityOperand1) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.BoolOperand) {
			result = interprete_hydraconstraints_BoolOperand((hydraconstraints.BoolOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Operand) {
			result = interprete_hydraconstraints_Operand((hydraconstraints.Operand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Constraint) {
			result = interprete_hydraconstraints_Constraint((hydraconstraints.Constraint) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof hydraconstraints.Model) {
			result = interprete_hydraconstraints_Model((hydraconstraints.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_hydraconstraints_Model(hydraconstraints.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Constraint(hydraconstraints.Constraint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Operand(hydraconstraints.Operand object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_BoolOperand(hydraconstraints.BoolOperand object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_BoolPriorityOperand1(hydraconstraints.BoolPriorityOperand1 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_BoolPriorityOperand2(hydraconstraints.BoolPriorityOperand2 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_LogicalOperator(hydraconstraints.LogicalOperator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_UnaryOp(hydraconstraints.UnaryOp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Neg(hydraconstraints.Neg object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_BinaryOp(hydraconstraints.BinaryOp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_And(hydraconstraints.And object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Or(hydraconstraints.Or object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Implies(hydraconstraints.Implies object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Xor(hydraconstraints.Xor object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Comparison(hydraconstraints.Comparison object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_More(hydraconstraints.More object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_MoreOrEqual(hydraconstraints.MoreOrEqual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_NotEqual(hydraconstraints.NotEqual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Less(hydraconstraints.Less object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Equal(hydraconstraints.Equal object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_LessOrEqual(hydraconstraints.LessOrEqual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_NumOperand(hydraconstraints.NumOperand object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_NumPriorityOperand2(hydraconstraints.NumPriorityOperand2 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_NumPriorityOperand1(hydraconstraints.NumPriorityOperand1 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_NumOperator(hydraconstraints.NumOperator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Plus(hydraconstraints.Plus object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Mul(hydraconstraints.Mul object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Minus(hydraconstraints.Minus object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Div(hydraconstraints.Div object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_NumOperandChoices(hydraconstraints.NumOperandChoices object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_MultipleFeature(hydraconstraints.MultipleFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_SimpleFeature(hydraconstraints.SimpleFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_BoolOperandChoices(hydraconstraints.BoolOperandChoices object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Context(hydraconstraints.Context object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Selection(hydraconstraints.Selection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Any(hydraconstraints.Any object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_All(hydraconstraints.All object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_hydraconstraints_Number(hydraconstraints.Number object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (hydraconstraints.resource.hydraConst.IHydraConstInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(hydraconstraints.resource.hydraConst.IHydraConstInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(hydraconstraints.resource.hydraConst.IHydraConstInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
