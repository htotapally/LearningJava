package deepthi.datastructures.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeapTest {
	@Test
	public void testEmptyHeap() {
		IHeap heap = new Heap();
		int size = heap.getSize();
		int expectedValue = 0;
		assertEquals(size,expectedValue);
	}
	
	@Test
	public void testInsertionOfOneElement() {
		IHeap heap = new Heap();
		heap.insert(10);
		int size = heap.getSize();
		int expectedValue = 1;
		assertEquals(size,expectedValue);
		
		int expectedMaximum = 10;
		int maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap,expectedMaximum);		
	}
	
	@Test
	public void testInsertionOfTwoElements() {
		IHeap heap = new Heap();
		heap.insert(10);
		
		int heapSize = heap.getSize();
		int expectedSize = 1;
		assertEquals(heapSize,expectedSize);
		
		int expectedMaximum = 10;
		int maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap,expectedMaximum);
		
		//adding second element 
		//size must be two 
		//adding twenty so expected maximum must be 20
		//maximum value returned from the heap must also be twenty
		heap.insert(20);
		heapSize = heap.getSize();
		expectedSize = 2;
		assertEquals(heapSize, expectedSize);
		
		expectedMaximum = 20;
		maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap, expectedMaximum);
	}
	
	public void testInsertionOfThreeElements() {
		IHeap heap = new Heap();
		heap.insert(10);
		
		int heapSize = heap.getSize();
		int expectedSize = 1;
		assertEquals(heapSize,expectedSize);
		
		int expectedMaximum = 10;
		int maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap,expectedMaximum);
		
		//adding second element 
		//size must be two 
		//adding twenty so expected maximum must be 20
		//maximum value returned from the heap must also be twenty
		heap.insert(20);
		heapSize = heap.getSize();
		expectedSize = 2;
		assertEquals(heapSize, expectedSize);
		
		expectedMaximum = 20;
		maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap, expectedMaximum);
		
		heap.insert(30);
		heapSize = heap.getSize();
		expectedSize = 3;
		assertEquals(heapSize, expectedSize);
		
		expectedMaximum = 30;
		maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap, expectedMaximum);
	}
	
	
	
	@Test
	public void testPrintValues() {
		IHeap heap = new Heap();
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
		IHeap heap = new Heap();
		heap.insert(10);
		heap.insert(30);
		heap.insert(50);
		heap.insert(10);
		//heap.heapify();
		int max = heap.findMax();
		System.out.println(max);
	}
	
	
	@Test
	public void testParentIndex() {
		IHeap heap = new Heap();
		int parentIndex = heap.getParentIndex(3);
		//int expectedValue = 1;
		System.out.println(parentIndex);
	}
	
	@Test
	public void testHeapify() {
		IHeap heap = new Heap();
		heap.insert(40);
		heap.insert(10);
		heap.insert(20);
		heap.insert(40);
		heap.insert(50);
		//heap.heapify();
	}
	
	@Test
	public void testHeapified() {
		IHeap heap = new Heap();
		heap.heapified();
	}
	
	@Test
	public void testSwap() {
		IHeap heap = new Heap();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		IHeap heap = new Heap();
		heap.insert(10);
		
		int heapSize = heap.getSize();
		int expectedSize = 1;
		assertEquals(heapSize,expectedSize);
		
		int expectedMaximum = 10;
		int maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap,expectedMaximum);
		
		//adding second element 
		//size must be two 
		//adding twenty so expected maximum must be 20
		//maximum value returned from the heap must also be twenty
		heap.insert(20);
		heapSize = heap.getSize();
		expectedSize = 2;
		assertEquals(heapSize, expectedSize);
		
		expectedMaximum = 20;
		maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap, expectedMaximum);
		
		heap.insert(30);
		heapSize = heap.getSize();
		expectedSize = 3;
		assertEquals(heapSize, expectedSize);
		
		expectedMaximum = 30;
		maxFromHeap = heap.findMax();
		assertEquals(maxFromHeap, expectedMaximum);
	}
	
}
