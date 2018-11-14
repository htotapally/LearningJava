package leela.datastructures.collections;

import org.junit.Test;


public class TestBubbleSort {
	@Test
	public void testBubbleSort() {
		int[] array = { 2, 3, 1, 4, 0, -5 };
		BubbleSort.bubbleSort(array);
	}

}
