package leela.datastructures.collections;

import org.junit.Test;

public class TestBinarySearch {
	@Test
	public void testBSearch()
	{
		int[] array = {0,10,15,20,40};
		int last = array.length - 1;
		int result = BinarySearch.bSearch(array, 0 , last, 20);
		System.out.println("element found at pos " +  result);
	
		
	}

}
