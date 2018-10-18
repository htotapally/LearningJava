package leela.datastructures.collections;

import org.junit.Test;

public class TestLinkedList {
	@Test
	public void testAddNode() {
		LinkedList linkedList = new LinkedList();	
		Node tailNode = linkedList.getTailNode();
		System.out.println(tailNode);
		
		Node node1 = new Node(20, null);
		System.out.println(node1);
		linkedList.addNode(node1);
		tailNode = linkedList.getTailNode();
		System.out.println(tailNode);

		Node node2 = new Node(30, null);
		System.out.println("Address of node2: " + node2);
		linkedList.addNode(node2);
		tailNode = linkedList.getTailNode();
		System.out.println("Address of tailNode: " + tailNode);

		Node node3 = new Node(40, null);
		System.out.println(node3);
		linkedList.addNode(node3);
		tailNode = linkedList.getTailNode();
		System.out.println(tailNode);


	}
}
