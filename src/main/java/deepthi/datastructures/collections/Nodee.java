package deepthi.datastructures.collections;

public class Nodee {
	int data;
	Nodee prevNode;
	Nodee nextNode;

	public Nodee(int data,Nodee prevNode , Nodee nextNode) {
		this.data = data;
		this.prevNode = prevNode;
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodee getNextNode() {
		return nextNode;
	}

	public void setNextNode(Nodee node) {
		this.nextNode = node;

	}
	public Nodee getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Nodee node) {
		this.prevNode = node;
	}
	
	
}
