package leela.datastructures.collections;

import org.junit.Test;

public class TestSwapNodes {
	@Test
	public void testSwapNodes()
	{
		LinkedList linkedList = new LinkedList();
		Node tailNode;

		Node node1 = new Node(20, null);
		linkedList.addNode(node1);
		tailNode = linkedList.getTailNode();

		Node node2 = new Node(30, null);
		linkedList.addNode(node2);
		tailNode = linkedList.getTailNode();

		Node node3 = new Node(40, null);
		linkedList.addNode(node3);
		tailNode = linkedList.getTailNode();
		
		System.out.println("Before Swapping");
		
        int size = linkedList.getSize();
		
		int[] values = linkedList.getValues();
		for (int i = 0; i < size; i++) {
		}
		
        Node[] nodes = linkedList.getNodes();	 
		 for(int i = 0 ; i <size; i++)
		 {
		 System.out.println("node at pos " + i + " : " + nodes[i] + " :value = "+ values[i]);
		 }
		 
		 System.out.println("After Swapping");
		
		linkedList.swapNodes(1, 2);
	}

}
