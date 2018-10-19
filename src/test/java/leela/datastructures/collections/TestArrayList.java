package leela.datastructures.collections;

import org.junit.Test;

public class TestArrayList {
	@Test
	public void testEmptyList()
	{
		ArrayList arrayList = new ArrayList();
		int size = arrayList.getSize();
		for(int i = 0 ; i < size ; i++)
		{
			int element = arrayList.getElement(i);
			System.out.println(element);
		}
	}
	
	@Test
	public void testAddElement()
	{
		ArrayList arrayList = new ArrayList();
		arrayList.addElement(101);
		arrayList.addElement(102);
		arrayList.addElement(103);
		System.out.println("Test add element");
		int size = arrayList.getSize();
		for(int i = 0; i < size; i++)
		{
			int element = arrayList.getElement(i);
			System.out.println(element);
		}
	}
	
	@Test
	public void testCapacity()
	{
		ArrayList arrayList = new ArrayList();
		arrayList.addElement(101);
		arrayList.addElement(102);
		arrayList.addElement(103);
		arrayList.addElement(104);
		arrayList.addElement(105);
		arrayList.addElement(106);
		int size = arrayList.getSize();
		System.out.println("Test Capacity");
		for(int i = 0; i < size; i++)
		{
			int element = arrayList.getElement(i);
			System.out.println(element);
		}
	}
	
	@Test
	public void testSecondCapacity()
	{
		ArrayList arrayList = new ArrayList();
		arrayList.addElement(101);
		arrayList.addElement(102);
		arrayList.addElement(103);
		arrayList.addElement(104);
		arrayList.addElement(105);
		System.out.println("Test Second  Capacity");
		int size = arrayList.getSize();
		for(int i = 0; i < size; i++)
		{
			int element = arrayList.getElement(i);
			System.out.println(element);
		}
	}

}
