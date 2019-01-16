package leela.datastructures.collections;

public class BubbleSort {
	public static void bubbleSort(int[] array) {
		int oIterations = array.length;
		int iIterations = array.length;
		for (int i = 0; i < oIterations; i++) {
			
			iIterations = iIterations - 1;
			for (int j = 0; j < iIterations; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			} 
			
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
	}

}
