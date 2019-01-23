package deepthi.datastructures.collections;

public interface IHeap {
	public int findMax();

	public void insert(int data);

	public void remove(int data);
	
	public void printValues();
	
	public int getSize();
	
	public int getParentIndex(int currentPosition);
	
	public void heapify(int currentPosition);
	
	public boolean heapified();
}
