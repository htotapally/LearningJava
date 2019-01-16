package deepthi.datastructures.collections;

public class Heap implements Iheap{
	int[] values = new int[10];
	int currentPosition = 0;

	@Override
	public int findMax() {
		int max = values[0];
		return max;
	}
	

	@Override
	public void insert(int data) {
		values[currentPosition]=data;
		currentPosition++;
		
	}

	@Override
	public void remove(int data) {
		
		
	}
	
	@Override
	public int getParentIndex(int currentPosition) {
		int parentIndex = -1;
		
		if(currentPosition == 1) {
			parentIndex = 0;
		} else {
			if(currentPosition % 2 == 0) {
				parentIndex = (currentPosition - 2) / 2;
			} else {
				parentIndex = (currentPosition - 1) / 2;
			}
		}
		return parentIndex;
	}

	@Override
	public void printValues() {
		for(int i=0;i<currentPosition;i++) {
			System.out.println(values[i]);
		}
		
	}
	
	public void swap(int currentValue,int parentValue) {
		int temp;
		temp = parentValue;
		parentValue = currentValue;
		currentValue = temp;		
	}
	
	@Override
	public int getSize() {
		
		return currentPosition;
	}
	
	@Override
	public boolean heapified() {
		boolean heapified = false;
		int presentValue = values[currentPosition];
		int parentValue = getParentIndex(currentPosition);
		for(int i=0;i<currentPosition;i++) {
		if(presentValue>parentValue) {
			heapified = false;
		}
		
		else {
			heapified = true;
		}
		}
			return heapified;
		
	}
	

	@Override
	public void heapify() {
		int currentValue = values[currentPosition];
		int parentValue = values[getParentIndex(currentPosition)];
		if(currentPosition==0) {
			System.out.println("Already heapified");
		}
		else {
			if(!heapified()) {
				swap(currentValue,parentValue);
			}
		}
		for(int i=0;i<currentPosition;i++) {
			System.out.println(values[i]);
		}
			
		}
		
		
		
		// TODO Auto-generated method stub
		
	

}

