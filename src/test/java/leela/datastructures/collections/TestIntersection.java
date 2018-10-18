package leela.datastructures.collections;

import org.junit.Test;


public class TestIntersection {
	@Test
	public void testIntersection()
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
		
		int size = linkedList.getSize();
		
		int[] values = linkedList.getValues();
		
        LinkedList linkedList1 = new LinkedList();
		
		Node node5 = new Node(20, null);
		linkedList1.addNode(node5);

		Node node6 = new Node(30, null);
		linkedList1.addNode(node6);

		Node node7 = new Node(50, null);
		linkedList1.addNode(node7);
		
		size = linkedList1.getSize();
		
		int[] values1 = linkedList1.getValues();

		linkedList1.intersection(values, values1);
		
		
		
	
	}

}
