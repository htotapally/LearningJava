package leela.datastructures.collections;

public class BinarySearch {
	public static int bSearch(int[] array, int first, int last, int key) {

		if (first == last) {
			return first;
		} else {
			int mid = (first + last) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] < key) {
				return bSearch(array, mid + 1, last, key);

			} else if (array[mid] > key) {
				return bSearch(array, first, mid - 1, key);
			} else {
				return -1;
			}
		}
	}

}
