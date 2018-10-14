package deepthi.datastructures.collections;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void testEmptyList() {
		ArrayList arrayList = new ArrayList();
		int size = arrayList.getSize();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			int element = arrayList.getElement(i);
			System.out.println(element);
		}

	}
	
	@Test
	public void testAddElement() {
		ArrayList arrayList = new ArrayList();	
		int[] myElements = {11, 12, 13, 14, 15};
		for(int i = 0; i < myElements.length; i++) {
			arrayList.addElement(myElements[i]);
		}		
		assertEquals(arrayList.getSize(), 5);
		for(int i = 0; i < myElements.length; i++) {
			assertEquals(myElements[i], arrayList.getElement(i));
		}
	}
	
	@Test
	public void testCapacity() {
		ArrayList arrayList = new ArrayList();
		arrayList.addElement(11);
		arrayList.addElement(12);
		arrayList.addElement(13);
		arrayList.addElement(14);
		arrayList.addElement(15);
		arrayList.addElement(16);
		
		int size = arrayList.getSize();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			int element = arrayList.getElement(i);
			System.out.println(element);
		}
		
	}
	
	@Test
	public void testCapacitySecondTime() {
		ArrayList arrayList = new ArrayList();
		arrayList.addElement(11);
		arrayList.addElement(12);
		arrayList.addElement(13);
		arrayList.addElement(14);
		arrayList.addElement(15);
		arrayList.addElement(16);
		arrayList.addElement(17);
		arrayList.addElement(18);
		arrayList.addElement(19);
		arrayList.addElement(20);
		arrayList.addElement(21);
		arrayList.addElement(22);
		arrayList.addElement(23);
		arrayList.addElement(24);
		arrayList.addElement(25);
		arrayList.addElement(26);
		
		int size = arrayList.getSize();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			int element = arrayList.getElement(i);
			System.out.println(element);
		}
		
	}


}
