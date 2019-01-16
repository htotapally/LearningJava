package deepthi.datastructures.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoubleLinkedlistTest {

	@Test
	public void testEmptyList() {

		int expectedSize = 0;

		DoubleLinkedList doublyLinkedList = new DoubleLinkedList();
		int listSize = doublyLinkedList.getSize();

		assertEquals(expectedSize, listSize);
	}

	@Test
	public void testOneNode() {

		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

		Nodee node = new Nodee(10, null, null);

		doubleLinkedList.addNode(node);

		int size = doubleLinkedList.getSize();

		int expectedSize = 1;
		assertEquals(expectedSize, size);

	}
	
	@Test
	public void testTwoNode() {
		
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		
		Nodee node = new Nodee(10,null,null);
		Nodee node1 = new Nodee(20,null,null);
		doubleLinkedList.addNode(node);
		doubleLinkedList.addNode(node1);
		int size = doubleLinkedList.getSize();
		int expectedSize = 2;
		assertEquals(expectedSize, size);
	}

}
