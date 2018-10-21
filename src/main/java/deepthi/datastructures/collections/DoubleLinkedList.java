package deepthi.datastructures.collections;

public class DoubleLinkedList {
	private Nodee headNode;
	private Nodee tailNode;
	
	
	public void addNode(Nodee node) {
		if(headNode == null) {
			headNode = node;
		}
		else
		{
			headNode.setPrevNode(node);
		}
		
	}
	
	


}
