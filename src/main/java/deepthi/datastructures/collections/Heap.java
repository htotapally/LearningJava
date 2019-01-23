package deepthi.datastructures.collections;

public class Heap implements IHeap {


	int[] values = new int[10];

	int currentPosition = 0;

	@Override

	public int findMax() {

		int max = values[0];

		return max;

	}
	
	
	@Override

	public void insert(int data) {

		values[currentPosition] = data;

		heapify(currentPosition);

		currentPosition++;

	}
	
	@Override

	public void remove(int data) {

	}
	
	@Override

	public int getParentIndex(int currentPosition) {

		int parentIndex = -1;

		if (currentPosition == 1) {

			parentIndex = 0;

		} else {

			if (currentPosition % 2 == 0) {

				parentIndex = (currentPosition - 2) / 2;

			} else {

				parentIndex = (currentPosition - 1) / 2;

			}

		}

		return parentIndex;

	}
	
	@Override

	public void printValues() {

		for (int i = 0; i < currentPosition; i++) {

			System.out.println(values[i]);

		}

	}
	
	public void swap(int currentValue, int parentValue) {

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

		} else {

			heapified = true;

		}
		}
		return heapified;

	}
	
	
	@Override

	public void heapify(int currentPosition) {

		if(currentPosition == 0) {

			  // Nothing to be done

		} else {

			  // size is greater than zero

			  // check the value at currentPostion to the value at the parentPosition

			  // First determine parent position

			  if(currentPosition == 1) {

				  currentPosition = 1;

				  int parentPosition = 0;

				  int currentValue = values[currentPosition];

				  int parentValue = values[parentPosition];

				  // Check if parent value is less than currentValue

				  if(currentValue > parentValue) {

					  // swap currentValue, and parentValue
	
					  int temp = parentValue;
	
					  //I'm trying to store current value in the parent position
	
					  values[parentPosition] = currentValue;
	
					  values[currentPosition] = temp;

				  }
			  }

			  if(currentPosition == 2) {

						currentPosition = 2;

					   int parentPosition = 0;

					   int currentValue = values[currentPosition];

					   int parentValue = values[parentPosition];

					  // Check if parent value is less than currentValue

					  if(currentValue > parentValue) {

						  // swap currentValue, and parentValue
	
						  int temp = parentValue;
	
						  //I'm trying to store current value in the parent position
	
						  values[parentPosition] = currentValue;
	
						  values[currentPosition] = temp;

					  } 
			  }
		}
	}
	
}





