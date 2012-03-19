package specializationModel.diagram.providers;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.TopDownProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

public class SpecializationmodelDefaultLayoutProvider extends TopDownProvider {
	public static String DEFAULT_LAYOUT = "Default";

    public boolean provides(IOperation operation) {
        // enable this provider only on mindmap diagrams
    	
        if (operation instanceof ILayoutNodeOperation) {
            Iterator nodes = ((ILayoutNodeOperation) operation)
                .getLayoutNodes().listIterator();
            if (nodes.hasNext()) {
                View node = ((ILayoutNode) nodes.next()).getNode();
                Diagram container = node.getDiagram();
                if (container == null) //$NON-NLS-1$
                    return false;
            }
        } else {
            return false;
        }
        IAdaptable layoutHint = ((ILayoutNodeOperation) operation)
            .getLayoutHint();
        String layoutType = (String) layoutHint.getAdapter(String.class);
        return LayoutType.DEFAULT.equals(layoutType);
    }
    
    @Override
	protected List getRelevantConnections(Hashtable editPartToNodeDict) {
		Enumeration enumeration = editPartToNodeDict.keys();
		ArrayList connectionsToMove = new ArrayList();
		while (enumeration.hasMoreElements()) {
			Object e = enumeration.nextElement();
			GraphicalEditPart shapeEP = (GraphicalEditPart) e;
			Set sourceConnections = new HashSet(shapeEP.getSourceConnections());
			if (shapeEP instanceof IBorderedShapeEditPart) {
				List borderItems = getBorderItemEditParts(shapeEP,
						editPartToNodeDict);
				for (Iterator iter = borderItems.iterator(); iter.hasNext();) {
					GraphicalEditPart element = (GraphicalEditPart) iter.next();
					sourceConnections.addAll(element.getSourceConnections());
				}
			}

			for (Iterator iter = sourceConnections.iterator(); iter.hasNext();) {
				ConnectionEditPart connectionEP = (ConnectionEditPart) iter
						.next();
				EditPart target = connectionEP.getTarget();
				// check to see if the toView is in the shapesDict, if yes,
				// the associated connectionView should be included on graph
				if (target instanceof IBorderItemEditPart)
					target = target.getParent();
				if (target != null) {
					Object o = editPartToNodeDict.get(target);
					
					// aqu� es donde se produce el error
					if (o != null) {
						connectionsToMove.add(connectionEP);
					}
				}
			}

			if (shouldHandleConnectableListItems()) {
				handleConnectableListItems(shapeEP, editPartToNodeDict,
						connectionsToMove);
			}
		}

		return connectionsToMove;
	}
    
    private void handleConnectableListItems(GraphicalEditPart shapeEP, Map editPartToNodeDict, ArrayList connectionsToMove) {
        List children = shapeEP.getChildren();
        for (Iterator iter = children.iterator(); iter.hasNext();) {
            EditPart ep = (EditPart) iter.next();
            if (ep instanceof ListCompartmentEditPart){
                List listItems = ep.getChildren();
                for (Iterator iterator = listItems.iterator(); iterator
                    .hasNext();) {
                    GraphicalEditPart listItem = (GraphicalEditPart) iterator.next();
                    List connections =listItem.getSourceConnections();
                    for (Iterator connectionIterator = connections.iterator(); connectionIterator
                        .hasNext();) {
                        ConnectionEditPart connectionEP = (ConnectionEditPart) connectionIterator.next();
                        EditPart ancestor = getFirstAnscestorinNodesMap(connectionEP.getTarget(),editPartToNodeDict);
                        if (ancestor!=null)
                            connectionsToMove.add(connectionEP);
                    }
                }
            }
            
        }
        
    }

    private EditPart getFirstAnscestorinNodesMap(EditPart editPart,Map editPartToNodeDict) {
        EditPart ancestor =  editPart;
        while (ancestor!=null){
            if (editPartToNodeDict.get(ancestor)!=null)
                return ancestor;
            ancestor = ancestor.getParent();
        }
        return null;
    }

    /**
     * This method searches an edit part for a child that is a border item edit part
     * @param parent part needed to search
     * @param set to be modified of border item edit parts that are direct children of the parent
     */
    private List getBorderItemEditParts(EditPart parent, Hashtable editPartToNodeDict ) {
        Iterator iter = parent.getChildren().iterator();
        List list = new ArrayList();
        while(iter.hasNext()) {
            EditPart child = (EditPart)iter.next();
            if (!editPartToNodeDict.containsKey(child) && child instanceof IBorderItemEditPart) {
                list.add(child);
            }
        }
        return list;
    }

}