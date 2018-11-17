 package leela.datastructures.collections;

public class Node {
	int data;
	Node nextNode;

	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node node) {
		this.nextNode = node;

	}

}
