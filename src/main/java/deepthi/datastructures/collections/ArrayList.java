package deepthi.datastructures.collections;

import java.util.Arrays;

public class ArrayList {
	private int position = 0;
	private int capacity = 5;
	private int[] elements = new int[capacity];
	
	public ArrayList(){
		
		
	}

	public void addElement(int element) {
		if (position == elements.length) {
			int newArray = elements.length * 3;
			elements = Arrays.copyOf(elements, newArray);
			elements[position++] = element;
		} else {
			elements[position++] = element;
		}
	}
	
	public int getSize() {
		int size = elements.length;
		return size;
	}
	
	public int getElement(int position) {
		return elements[position];
	}

}
