package leela.datastructures.collections;

import java.util.Arrays;

public class ArrayList {
	int position = 0;
	int capacity = 5;
	int[] array = new int[capacity];

	public void addElement(int element) {
		if (position == array.length) {
			int newArray = array.length * 2;
			array = Arrays.copyOf(array, newArray);
			array[position++]=element;
		} else {
			array[position++] = element;
		}
	}
	public int getElement(int position) {
		return array[position];
	}

}