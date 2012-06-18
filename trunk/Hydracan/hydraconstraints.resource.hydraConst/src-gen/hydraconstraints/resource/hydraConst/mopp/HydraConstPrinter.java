/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hydraconstraints.resource.hydraConst.mopp;

public class HydraConstPrinter implements hydraconstraints.resource.hydraConst.IHydraConstTextPrinter {
	
	protected hydraconstraints.resource.hydraConst.IHydraConstTokenResolverFactory tokenResolverFactory = new hydraconstraints.resource.hydraConst.mopp.HydraConstTokenResolverFactory();
	
	protected java.io.OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private hydraconstraints.resource.hydraConst.IHydraConstTextResource resource;
	
	private java.util.Map<?, ?> options;
	
	public HydraConstPrinter(java.io.OutputStream outputStream, hydraconstraints.resource.hydraConst.IHydraConstTextResource resource) {
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
		
		if (element instanceof hydraconstraints.Model) {
			print_hydraconstraints_Model((hydraconstraints.Model) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Constraint) {
			print_hydraconstraints_Constraint((hydraconstraints.Constraint) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.BoolPriorityOperand1) {
			print_hydraconstraints_BoolPriorityOperand1((hydraconstraints.BoolPriorityOperand1) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.BoolPriorityOperand2) {
			print_hydraconstraints_BoolPriorityOperand2((hydraconstraints.BoolPriorityOperand2) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.NumPriorityOperand1) {
			print_hydraconstraints_NumPriorityOperand1((hydraconstraints.NumPriorityOperand1) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.NumPriorityOperand2) {
			print_hydraconstraints_NumPriorityOperand2((hydraconstraints.NumPriorityOperand2) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.And) {
			print_hydraconstraints_And((hydraconstraints.And) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Or) {
			print_hydraconstraints_Or((hydraconstraints.Or) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Xor) {
			print_hydraconstraints_Xor((hydraconstraints.Xor) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Implies) {
			print_hydraconstraints_Implies((hydraconstraints.Implies) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Neg) {
			print_hydraconstraints_Neg((hydraconstraints.Neg) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Plus) {
			print_hydraconstraints_Plus((hydraconstraints.Plus) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Minus) {
			print_hydraconstraints_Minus((hydraconstraints.Minus) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Mul) {
			print_hydraconstraints_Mul((hydraconstraints.Mul) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Div) {
			print_hydraconstraints_Div((hydraconstraints.Div) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Context) {
			print_hydraconstraints_Context((hydraconstraints.Context) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.All) {
			print_hydraconstraints_All((hydraconstraints.All) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Any) {
			print_hydraconstraints_Any((hydraconstraints.Any) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.More) {
			print_hydraconstraints_More((hydraconstraints.More) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.MoreOrEqual) {
			print_hydraconstraints_MoreOrEqual((hydraconstraints.MoreOrEqual) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Less) {
			print_hydraconstraints_Less((hydraconstraints.Less) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.LessOrEqual) {
			print_hydraconstraints_LessOrEqual((hydraconstraints.LessOrEqual) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.NotEqual) {
			print_hydraconstraints_NotEqual((hydraconstraints.NotEqual) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Equal) {
			print_hydraconstraints_Equal((hydraconstraints.Equal) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.SimpleFeature) {
			print_hydraconstraints_SimpleFeature((hydraconstraints.SimpleFeature) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.MultipleFeature) {
			print_hydraconstraints_MultipleFeature((hydraconstraints.MultipleFeature) element, globaltab, out);
			return;
		}
		if (element instanceof hydraconstraints.Number) {
			print_hydraconstraints_Number((hydraconstraints.Number) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected hydraconstraints.resource.hydraConst.mopp.HydraConstReferenceResolverSwitch getReferenceResolverSwitch() {
		return (hydraconstraints.resource.hydraConst.mopp.HydraConstReferenceResolverSwitch) new hydraconstraints.resource.hydraConst.mopp.HydraConstMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		hydraconstraints.resource.hydraConst.IHydraConstTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new hydraconstraints.resource.hydraConst.mopp.HydraConstProblem(errorMessage, hydraconstraints.resource.hydraConst.HydraConstEProblemType.PRINT_PROBLEM, hydraconstraints.resource.hydraConst.HydraConstEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public hydraconstraints.resource.hydraConst.IHydraConstTextResource getResource() {
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
	
	public void print_hydraconstraints_Model(hydraconstraints.Model element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__FEATURE_LIST));
		printCountingMap.put("featureList", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__CONSTRAINTS));
		printCountingMap.put("constraints", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__FEATURE_LIST));
			if (o != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIRECCION");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__FEATURE_LIST), element));
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
			print_hydraconstraints_Model_0(element, localtab, out1, printCountingMap1);
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
	
	public void print_hydraconstraints_Model_0(hydraconstraints.Model element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("constraints");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MODEL__CONSTRAINTS));
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
	
	
	public void print_hydraconstraints_Constraint(hydraconstraints.Constraint element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONSTRAINT__OPERATORS));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONSTRAINT__OPERATORS));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONSTRAINT__OPERATORS));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("operators", count - 1);
			}
		}
	}
	
	
	public void print_hydraconstraints_BoolPriorityOperand1(hydraconstraints.BoolPriorityOperand1 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND1__BOOL_PRIORITY_OP1));
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
	
	
	public void print_hydraconstraints_BoolPriorityOperand2(hydraconstraints.BoolPriorityOperand2 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.BOOL_PRIORITY_OPERAND2__BOOL_PRIORITY_OP2));
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
	
	
	public void print_hydraconstraints_NumPriorityOperand1(hydraconstraints.NumPriorityOperand1 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND1__NUM_PRIORITY_OP1));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("numPriorityOp1", count - 1);
			}
		}
	}
	
	
	public void print_hydraconstraints_NumPriorityOperand2(hydraconstraints.NumPriorityOperand2 element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2));
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
					Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2));
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
				Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUM_PRIORITY_OPERAND2__NUM_PRIORITY_OP2));
				if (o != null) {
					doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
				}
				printCountingMap.put("numPriorityOp2", count - 1);
			}
		}
	}
	
	
	public void print_hydraconstraints_And(hydraconstraints.And element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.AND__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.AND__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.AND__BINARY_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.AND__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Or(hydraconstraints.Or element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.OR__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.OR__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.OR__BINARY_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.OR__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Xor(hydraconstraints.Xor element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.XOR__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.XOR__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.XOR__BINARY_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.XOR__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Implies(hydraconstraints.Implies element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.IMPLIES__BINARY_OP1));
		printCountingMap.put("binaryOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.IMPLIES__BINARY_OP2));
		printCountingMap.put("binaryOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("binaryOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.IMPLIES__BINARY_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.IMPLIES__BINARY_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("binaryOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Neg(hydraconstraints.Neg element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NEG__UNARY_OP));
		printCountingMap.put("unaryOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("!");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("unaryOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NEG__UNARY_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("unaryOp", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Plus(hydraconstraints.Plus element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.PLUS__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.PLUS__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.PLUS__NUM_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.PLUS__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Minus(hydraconstraints.Minus element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MINUS__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MINUS__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MINUS__NUM_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MINUS__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Mul(hydraconstraints.Mul element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MUL__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MUL__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MUL__NUM_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MUL__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Div(hydraconstraints.Div element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.DIV__NUM_OP1));
		printCountingMap.put("numOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.DIV__NUM_OP2));
		printCountingMap.put("numOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("numOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.DIV__NUM_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.DIV__NUM_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("numOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Context(hydraconstraints.Context element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONTEXT__CONTEXT_OP2));
		printCountingMap.put("contextOp2", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONTEXT__CONTEXT_OP1));
		printCountingMap.put("contextOp1", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("contextOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONTEXT__CONTEXT_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.CONTEXT__CONTEXT_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("contextOp2", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
		out.print(" ");
	}
	
	
	public void print_hydraconstraints_All(hydraconstraints.All element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.ALL__SELECTION_OP));
		printCountingMap.put("selectionOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("all");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("selectionOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.ALL__SELECTION_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("selectionOp", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Any(hydraconstraints.Any element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.ANY__SELECTION_OP));
		printCountingMap.put("selectionOp", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("any");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("selectionOp");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.ANY__SELECTION_OP));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("selectionOp", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_More(hydraconstraints.More element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE__COMP_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_MoreOrEqual(hydraconstraints.MoreOrEqual element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE_OR_EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE_OR_EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE_OR_EQUAL__COMP_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MORE_OR_EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Less(hydraconstraints.Less element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS__COMP_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_LessOrEqual(hydraconstraints.LessOrEqual element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS_OR_EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS_OR_EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS_OR_EQUAL__COMP_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.LESS_OR_EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_NotEqual(hydraconstraints.NotEqual element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NOT_EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NOT_EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NOT_EQUAL__COMP_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NOT_EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Equal(hydraconstraints.Equal element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.EQUAL__COMP_OP1));
		printCountingMap.put("compOp1", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.EQUAL__COMP_OP2));
		printCountingMap.put("compOp2", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compOp1");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.EQUAL__COMP_OP1));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.EQUAL__COMP_OP2));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("compOp2", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_SimpleFeature(hydraconstraints.SimpleFeature element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME));
		printCountingMap.put("featureName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("featureName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME));
			if (o != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.SIMPLE_FEATURE__FEATURE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("featureName", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_MultipleFeature(hydraconstraints.MultipleFeature element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME));
		printCountingMap.put("featureName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("featureName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME));
			if (o != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.MULTIPLE_FEATURE__FEATURE_NAME), element));
				out.print(" ");
			}
			printCountingMap.put("featureName", count - 1);
		}
	}
	
	
	public void print_hydraconstraints_Number(hydraconstraints.Number element, String outertab, java.io.PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUMBER__NUM_VALUE));
		printCountingMap.put("numValue", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("numValue");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUMBER__NUM_VALUE));
			if (o != null) {
				hydraconstraints.resource.hydraConst.IHydraConstTokenResolver resolver = tokenResolverFactory.createTokenResolver("DIGIT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(hydraconstraints.HydraconstraintsPackage.NUMBER__NUM_VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("numValue", count - 1);
		}
	}
	
	
}
