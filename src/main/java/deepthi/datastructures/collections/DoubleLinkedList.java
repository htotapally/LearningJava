package deepthi.datastructures.collections;

public class DoubleLinkedList {

	private Nodee headNode = null;

	public void addNode(Nodee node) {

		if (headNode == null) {
			headNode = node;
		} else {
			Nodee tailNode = getTailNode();
			tailNode.setNextNode(node);
			node.setPrevNode(tailNode);
		}
	}

	private Nodee getTailNode() {
		Nodee tailNode = null;

		if (headNode == null) {
			tailNode = null;
		} else {
			Nodee currentNode = headNode;

			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}

			tailNode = currentNode;

		}

		return tailNode;
	}

	public int getSize() {
		int size = 0;

		if (headNode == null) {
			size = 0;
		} else {

			Nodee currentNode = headNode;
			size = 1;

			while (currentNode.getNextNode() != null) {
				size++;
				currentNode = currentNode.getNextNode();
			}
		}

		return size;
	}

	public int[] getValues() {
		int[] values = null;

		int size = getSize();
		values = new int[size];

		int index = 0;

		Nodee currentNode = headNode;
		values[index] = currentNode.getData();

		while (currentNode.getNextNode() != null) {
			values[index++] = currentNode.getData();
			currentNode = currentNode.getNextNode();

		}

		return values;
	}
}
