package deepthi.datastructures.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void testEmptyList() {
		LinkedList linkedList = new LinkedList();
		int size = linkedList.getSize();
		System.out.println(size);
		int[] values = linkedList.getValues();
		assertEquals(0,size);
	}

	@Test
	public void testOneNode() {
		LinkedList linkedList = new LinkedList();
		Node node = new Node(10, null);
		linkedList.addNode(node);
		int size = linkedList.getSize();
		assertEquals(1, size);

	}

	@Test
	public void testTwoNodes() {
		LinkedList linkedList = new LinkedList();
		Node node1 = new Node(10, null);
		Node node2 = new Node(20, null);
		linkedList.addNode(node1);
		linkedList.addNode(node2);
		int size = linkedList.getSize();
		assertEquals(size, 2);
	}

	@Test
	public void testEvenClass() {
		LinkedList myLinkedList = new LinkedList();
		Node node = new Node(20, null);
		myLinkedList.addNode(node);
		node = new Node(33, null);
		myLinkedList.addNode(node);
		node = new Node(45, null);
		myLinkedList.addNode(node);
		node = new Node(55, null);
		myLinkedList.addNode(node);
		node = new Node(88, null);
		myLinkedList.addNode(node);
		int size = myLinkedList.getSize();
		System.out.println("The size of the linkedList is:");
		System.out.println(size);
		LinkedList evenLinkedList = new LinkedList();
		int[] values = new int[size];
		System.out.println("Values in the linkedList are :");
		values = myLinkedList.getValues();
		int i;
		for (i = 0; i < size; i++) {
			if (values[i] % 2 == 0) {
				Node node1 = new Node(values[i], null);
				evenLinkedList.addNode(node1);
			}
		}
		System.out.println("Values in the even LinkedList are :");
		values = evenLinkedList.getValues();
	}


	@Test
	public void testOddClass() {
		LinkedList myLinkedList = new LinkedList();
		Node node = new Node(20, null);
		myLinkedList.addNode(node);
		node = new Node(33, null);
		myLinkedList.addNode(node);
		node = new Node(45, null);
		myLinkedList.addNode(node);
		node = new Node(55, null);
		myLinkedList.addNode(node);
		node = new Node(88, null);
		myLinkedList.addNode(node);
		int size = myLinkedList.getSize();
		System.out.println("The size of the linkedList is:");
		System.out.println(size);
		LinkedList oddLinkedList = new LinkedList();
		int[] values = new int[size];
		System.out.println("Values in the linkedList are :");
		values = myLinkedList.getValues();
		int i;
		for (i = 0; i < size; i++) {
			if (values[i] % 2 != 0) {
				Node node1 = new Node(values[i], null);
				oddLinkedList.addNode(node1);
			}
		}
		System.out.println("Values in the Odd LinkedList are :");
		values = oddLinkedList.getValues();

	}
}

	