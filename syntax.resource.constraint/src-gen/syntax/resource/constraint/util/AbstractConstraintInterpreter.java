/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.util;

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
public class AbstractConstraintInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<syntax.resource.constraint.IConstraintInterpreterListener> listeners = new java.util.ArrayList<syntax.resource.constraint.IConstraintInterpreterListener>();
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
		if (object instanceof syntax.NumPriorityOperand1) {
			result = interprete_syntax_NumPriorityOperand1((syntax.NumPriorityOperand1) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.BoolPriorityOperand2) {
			result = interprete_syntax_BoolPriorityOperand2((syntax.BoolPriorityOperand2) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.NumPriorityOperand2) {
			result = interprete_syntax_NumPriorityOperand2((syntax.NumPriorityOperand2) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.BoolPriorityOperand1) {
			result = interprete_syntax_BoolPriorityOperand1((syntax.BoolPriorityOperand1) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.All) {
			result = interprete_syntax_All((syntax.All) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Context) {
			result = interprete_syntax_Context((syntax.Context) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.BoolOperandChoices) {
			result = interprete_syntax_BoolOperandChoices((syntax.BoolOperandChoices) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.NumOperandChoices) {
			result = interprete_syntax_NumOperandChoices((syntax.NumOperandChoices) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Model) {
			result = interprete_syntax_Model((syntax.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.MoreOrEqual) {
			result = interprete_syntax_MoreOrEqual((syntax.MoreOrEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Equal) {
			result = interprete_syntax_Equal((syntax.Equal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.NotEqual) {
			result = interprete_syntax_NotEqual((syntax.NotEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Less) {
			result = interprete_syntax_Less((syntax.Less) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.LessOrEqual) {
			result = interprete_syntax_LessOrEqual((syntax.LessOrEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.More) {
			result = interprete_syntax_More((syntax.More) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Implies) {
			result = interprete_syntax_Implies((syntax.Implies) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Xor) {
			result = interprete_syntax_Xor((syntax.Xor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Or) {
			result = interprete_syntax_Or((syntax.Or) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.And) {
			result = interprete_syntax_And((syntax.And) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Neg) {
			result = interprete_syntax_Neg((syntax.Neg) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Any) {
			result = interprete_syntax_Any((syntax.Any) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Minus) {
			result = interprete_syntax_Minus((syntax.Minus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Mul) {
			result = interprete_syntax_Mul((syntax.Mul) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Plus) {
			result = interprete_syntax_Plus((syntax.Plus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Div) {
			result = interprete_syntax_Div((syntax.Div) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.NumOperator) {
			result = interprete_syntax_NumOperator((syntax.NumOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Comparison) {
			result = interprete_syntax_Comparison((syntax.Comparison) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Selection) {
			result = interprete_syntax_Selection((syntax.Selection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.BinaryOp) {
			result = interprete_syntax_BinaryOp((syntax.BinaryOp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.UnaryOp) {
			result = interprete_syntax_UnaryOp((syntax.UnaryOp) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.LogicalOperator) {
			result = interprete_syntax_LogicalOperator((syntax.LogicalOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Number) {
			result = interprete_syntax_Number((syntax.Number) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.SimpleFeature) {
			result = interprete_syntax_SimpleFeature((syntax.SimpleFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.MultipleFeature) {
			result = interprete_syntax_MultipleFeature((syntax.MultipleFeature) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.NumOperand) {
			result = interprete_syntax_NumOperand((syntax.NumOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.BoolOperand) {
			result = interprete_syntax_BoolOperand((syntax.BoolOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Operand) {
			result = interprete_syntax_Operand((syntax.Operand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof syntax.Constraint) {
			result = interprete_syntax_Constraint((syntax.Constraint) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_syntax_Constraint(syntax.Constraint object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Operand(syntax.Operand object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_BoolOperand(syntax.BoolOperand object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_NumOperand(syntax.NumOperand object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_SimpleFeature(syntax.SimpleFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_MultipleFeature(syntax.MultipleFeature object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Number(syntax.Number object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_LogicalOperator(syntax.LogicalOperator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_UnaryOp(syntax.UnaryOp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_BinaryOp(syntax.BinaryOp object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Selection(syntax.Selection object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Comparison(syntax.Comparison object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_NumOperator(syntax.NumOperator object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Div(syntax.Div object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Plus(syntax.Plus object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Mul(syntax.Mul object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Minus(syntax.Minus object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Context(syntax.Context object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_All(syntax.All object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Any(syntax.Any object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Neg(syntax.Neg object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_And(syntax.And object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Or(syntax.Or object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Xor(syntax.Xor object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Implies(syntax.Implies object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_More(syntax.More object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_LessOrEqual(syntax.LessOrEqual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Less(syntax.Less object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_NotEqual(syntax.NotEqual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Equal(syntax.Equal object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_MoreOrEqual(syntax.MoreOrEqual object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_Model(syntax.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_NumOperandChoices(syntax.NumOperandChoices object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_BoolOperandChoices(syntax.BoolOperandChoices object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_BoolPriorityOperand1(syntax.BoolPriorityOperand1 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_NumPriorityOperand2(syntax.NumPriorityOperand2 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_BoolPriorityOperand2(syntax.BoolPriorityOperand2 object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_syntax_NumPriorityOperand1(syntax.NumPriorityOperand1 object, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (syntax.resource.constraint.IConstraintInterpreterListener listener : listeners) {
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
	
	public void addListener(syntax.resource.constraint.IConstraintInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(syntax.resource.constraint.IConstraintInterpreterListener listener) {
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
