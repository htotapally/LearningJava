package leela.datastructures.collections;

public class DoubleLinkedList {
	DNode headNode;
	
	public DoubleLinkedList()
	{

	}
	
	public void addNode(DNode newNode)
	{
		DNode tailNode = getTailNode();
		if(headNode == null)
		{
			tailNode = newNode;
		}
		else
		{
			tailNode.setnNode(newNode);
		}
		
	}
	public DNode getTailNode()
	{
		DNode tailNode = null;
		if (headNode == null) {
			tailNode = null;

		} else {
			DNode currentNode = headNode;
			DNode nextNode;
			DNode prevNode;
			
			do {
				nextNode = currentNode.getnNode();

				if (nextNode != null) {
					currentNode = currentNode.getnNode();

				} else if (nextNode == null) {

					tailNode = currentNode;
				}
			} while (nextNode != null);
		}
		return tailNode;
		
	}

}
