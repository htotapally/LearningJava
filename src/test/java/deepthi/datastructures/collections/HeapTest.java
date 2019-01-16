package deepthi.datastructures.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeapTest {
	@Test
	public void testEmptyHeap() {
		Iheap heap = new Heap();
		int size = heap.getSize();
		int expectedValue = 0;
		assertEquals(size,expectedValue);
	}
	
	@Test
	public void testInsertion() {
		Iheap heap= new Heap();
		heap.insert(10);
		heap.insert(20);
		int size = heap.getSize();
		int expectedValue = 2;
		assertEquals(size,expectedValue);
	}
	
	@Test
	public void testPrintValues() {
		Iheap heap = new Heap();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.printValues();
		int max = heap.findMax();
		System.out.println(max);
	}
	
	@Test
	public void testFindMax() {
		Iheap heap = new Heap();
		heap.insert(10);
		heap.insert(30);
		heap.insert(50);
		heap.insert(10);
		heap.heapify();
		int max = heap.findMax();
		System.out.println(max);
	}
	
	@Test
	public void testFindMin() {
		Iheap heap = new Heap();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		int min= heap.findMin();
		System.out.println(min);
	}
	@Test
	public void testParentIndex() {
		Iheap heap = new Heap();
		int parentIndex = heap.getParentIndex(3);
		int expectedValue = 1;
		System.out.println(parentIndex);
	}
	
	@Test
	public void testHeapify() {
		Iheap heap = new Heap();
		heap.insert(40);
		heap.insert(10);
		heap.insert(20);
		heap.insert(40);
		heap.insert(50);
		heap.heapify();
	}
	
	@Test
	public void testHeapified() {
		Iheap heap = new Heap();
		heap.heapified();
	}
	
	@Test
	public void testSwap() {
		Iheap heap = new Heap();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		
	}
	
}
