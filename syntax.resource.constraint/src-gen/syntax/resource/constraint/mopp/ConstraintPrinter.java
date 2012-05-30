/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package syntax.resource.constraint.mopp;

public class ConstraintPrinter implements syntax.resource.constraint.IConstraintTextPrinter {
	
	protected syntax.resource.constraint.IConstraintTokenResolverFactory tokenResolverFactory = new syntax.resource.constraint.mopp.ConstraintTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private syntax.resource.constraint.IConstraintTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public ConstraintPrinter(java.io.OutputStream outputStream, syntax.resource.constraint.IConstraintTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof syntax.Model) {
			print_syntax_Model((syntax.Model) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Constraint) {
			print_syntax_Constraint((syntax.Constraint) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.BoolPriorityOperand1) {
			print_syntax_BoolPriorityOperand1((syntax.BoolPriorityOperand1) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.BoolPriorityOperand2) {
			print_syntax_BoolPriorityOperand2((syntax.BoolPriorityOperand2) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.NumPriorityOperand1) {
			print_syntax_NumPriorityOperand1((syntax.NumPriorityOperand1) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.NumPriorityOperand2) {
			print_syntax_NumPriorityOperand2((syntax.NumPriorityOperand2) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.And) {
			print_syntax_And((syntax.And) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Or) {
			print_syntax_Or((syntax.Or) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Xor) {
			print_syntax_Xor((syntax.Xor) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Implies) {
			print_syntax_Implies((syntax.Implies) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Neg) {
			print_syntax_Neg((syntax.Neg) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Plus) {
			print_syntax_Plus((syntax.Plus) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Minus) {
			print_syntax_Minus((syntax.Minus) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Mul) {
			print_syntax_Mul((syntax.Mul) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Div) {
			print_syntax_Div((syntax.Div) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Context) {
			print_syntax_Context((syntax.Context) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.All) {
			print_syntax_All((syntax.All) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Any) {
			print_syntax_Any((syntax.Any) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.More) {
			print_syntax_More((syntax.More) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.MoreOrEqual) {
			print_syntax_MoreOrEqual((syntax.MoreOrEqual) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Less) {
			print_syntax_Less((syntax.Less) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.LessOrEqual) {
			print_syntax_LessOrEqual((syntax.LessOrEqual) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.NotEqual) {
			print_syntax_NotEqual((syntax.NotEqual) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Equal) {
			print_syntax_Equal((syntax.Equal) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.SimpleFeature) {
			print_syntax_SimpleFeature((syntax.SimpleFeature) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.MultipleFeature) {
			print_syntax_MultipleFeature((syntax.MultipleFeature) element, globaltab, out);
			return;
		}
		if (element instanceof syntax.Number) {
			print_syntax_Number((syntax.Number) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected syntax.resource.constraint.mopp.ConstraintReferenceResolverSwitch getReferenceResolverSwitch() {
		return (syntax.resource.constraint.mopp.ConstraintReferenceResolverSwitch) new syntax.resource.constraint.mopp.ConstraintMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		syntax.resource.constraint.IConstraintTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new syntax.resource.constraint.mopp.ConstraintProblem(errorMessage, syntax.resource.constraint.ConstraintEProblemType.PRINT_PROBLEM, syntax.resource.constraint.ConstraintEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public syntax.resource.constraint.IConstraintTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_syntax_Model(syntax.Model element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__CONSTRAINTS));
		printCountingMap.put("constraints", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__FEATURE_LIST));
		printCountingMap.put("featureList", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("import");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("featureList");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__FEATURE_LIST));
			if (o != null) {
				syntax.resource.constraint.IConstraintTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__FEATURE_LIST), element));
				out.print(" ");
			}
			printCountingMap.put("featureList", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_syntax_Model_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_syntax_Model_0(syntax.Model element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constraints");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MODEL__CONSTRAINTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("constraints", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		out.print(" ");
	}
	
	
	public void print_syntax_Constraint(syntax.Constraint element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS));
		printCountingMap.put("operators", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operators"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"operators"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("(");
				out.print(" ");
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("operators");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("operators", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print(")");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("operators");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONSTRAINT__OPERATORS));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("operators", count - 1);
			}
		}
	}
	
	
	public void print_syntax_BoolPriorityOperand1(syntax.BoolPriorityOperand1 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1));
		printCountingMap.put("boolPriorityOp1", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"boolPriorityOp1"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"boolPriorityOp1"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("boolPriorityOp1");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("boolPriorityOp1", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("(");
			out.print(" ");
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("boolPriorityOp1");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("boolPriorityOp1", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print(")");
			out.print(" ");
		}
	}
	
	
	public void print_syntax_BoolPriorityOperand2(syntax.BoolPriorityOperand2 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2));
		printCountingMap.put("boolPriorityOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"boolPriorityOp2"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"boolPriorityOp2"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("boolPriorityOp2");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("boolPriorityOp2", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("(");
			out.print(" ");
			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("boolPriorityOp2");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("boolPriorityOp2", count - 1);
			}
			// DEFINITION PART BEGINS (CsString)
			out.print(")");
			out.print(" ");
		}
	}
	
	
	public void print_syntax_NumPriorityOperand1(syntax.NumPriorityOperand1 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1));
		printCountingMap.put("numPriorityOp1", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"numPriorityOp1"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"numPriorityOp1"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("(");
				out.print(" ");
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("numPriorityOp1");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("numPriorityOp1", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print(")");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("numPriorityOp1");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("numPriorityOp1", count - 1);
			}
		}
	}
	
	
	public void print_syntax_NumPriorityOperand2(syntax.NumPriorityOperand2 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2));
		printCountingMap.put("numPriorityOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, java.util.Arrays.asList(		"numPriorityOp2"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, java.util.Arrays.asList(		"numPriorityOp2"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("(");
				out.print(" ");
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("numPriorityOp2");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2));
					if (o != null) {
						doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
					}
					printCountingMap.put("numPriorityOp2", count - 1);
				}
				// DEFINITION PART BEGINS (CsString)
				out.print(")");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("numPriorityOp2");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("numPriorityOp2", count - 1);
			}
		}
	}
	
	
	public void print_syntax_And(syntax.And element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("and");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.AND__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Or(syntax.Or element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("or");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.OR__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Xor(syntax.Xor element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("xor");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.XOR__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Implies(syntax.Implies element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("implies");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.IMPLIES__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Neg(syntax.Neg element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NEG__UNARY_OP));
		printCountingMap.put("unaryOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("unaryOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NEG__UNARY_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("unaryOp", count - 1);
		}
	}
	
	
	public void print_syntax_Plus(syntax.Plus element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.PLUS__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Minus(syntax.Minus element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MINUS__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Mul(syntax.Mul element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MUL__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Div(syntax.Div element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.DIV__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Context(syntax.Context element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP1));
		printCountingMap.put("contextOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP2));
		printCountingMap.put("contextOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contextOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("contextOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contextOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.CONTEXT__CONTEXT_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("contextOp2", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
	
	public void print_syntax_All(syntax.All element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.ALL__SELECTION_OP));
		printCountingMap.put("selectionOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("all");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("selectionOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.ALL__SELECTION_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("selectionOp", count - 1);
		}
	}
	
	
	public void print_syntax_Any(syntax.Any element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.ANY__SELECTION_OP));
		printCountingMap.put("selectionOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("any");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("selectionOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.ANY__SELECTION_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("selectionOp", count - 1);
		}
	}
	
	
	public void print_syntax_More(syntax.More element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_syntax_MoreOrEqual(syntax.MoreOrEqual element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MORE_OR_EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Less(syntax.Less element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_syntax_LessOrEqual(syntax.LessOrEqual element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("<=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.LESS_OR_EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_syntax_NotEqual(syntax.NotEqual element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("!=");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NOT_EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_syntax_Equal(syntax.Equal element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP1));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp1", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("==");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp2");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_syntax_SimpleFeature(syntax.SimpleFeature element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.SIMPLE_FEATURE__FEATURE_NAME));
		printCountingMap.put("featureName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("featureName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.SIMPLE_FEATURE__FEATURE_NAME));
			if (o != null) {
				syntax.resource.constraint.IConstraintTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(syntax.SyntaxPackage.SIMPLE_FEATURE__FEATURE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("featureName", count - 1);
		}
	}
	
	
	public void print_syntax_MultipleFeature(syntax.MultipleFeature element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MULTIPLE_FEATURE__FEATURE_NAME));
		printCountingMap.put("featureName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("featureName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MULTIPLE_FEATURE__FEATURE_NAME));
			if (o != null) {
				syntax.resource.constraint.IConstraintTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(syntax.SyntaxPackage.MULTIPLE_FEATURE__FEATURE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("featureName", count - 1);
		}
	}
	
	
	public void print_syntax_Number(syntax.Number element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUMBER__NUM_VALUE));
		printCountingMap.put("numValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("numValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUMBER__NUM_VALUE));
			if (o != null) {
				syntax.resource.constraint.IConstraintTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIGIT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(syntax.SyntaxPackage.NUMBER__NUM_VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("numValue", count - 1);
		}
	}
	
	
}
