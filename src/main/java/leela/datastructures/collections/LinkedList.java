package leela.datastructures.collections;

public class LinkedList {
	private Node headNode;

	public LinkedList() {
		System.out.println("Empty LinkedList");
	}

	public void addNode(Node newNode) {

		Node tailNode = getTailNode();
		if (tailNode == null) {
			headNode = newNode;
		} else {
			tailNode.setNextNode(newNode);
		}
	}

	public Node getTailNode() {
		Node tailNode = null;
		if (headNode == null) {
			tailNode = null;

		} else {
			Node currentNode = headNode;
			Node nextNode;
			do {
				nextNode = currentNode.getNextNode();

				if (nextNode != null) {
					currentNode = currentNode.getNextNode();

				} else if (nextNode == null) {

					tailNode = currentNode;
				}
			} while (nextNode != null);
		}
		return tailNode;
	}

	public int getSize()

	{
		int count = 0;
		Node tailNode;
		if (headNode == null) {
			tailNode = null;

		} else {
			count++;
			Node currentNode = headNode;
			Node nextNode;
			do {
				nextNode = currentNode.getNextNode();
				if (nextNode != null) {
					count++;
					currentNode = currentNode.getNextNode();

				} else {
					break;
				}
			} while (nextNode != null);

		}

		return count;
	}

	public int[] getValues() {
		int size = getSize();
		int[] values = new int[size];

		if (size > 0) {
			int pos = 0;
			Node currentNode = headNode;
			values[pos] = currentNode.getData();
			Node nextNode;
			do {
				nextNode = currentNode.getNextNode();
				if (nextNode != null) {
					currentNode = currentNode.getNextNode();
					pos++;
					values[pos] = currentNode.getData();
				}

			} while (nextNode != null);

		}
		return values;
	}

	public Node[] getNodes() {
		int size = getSize();
		Node[] nodes = new Node[size];
		if (size > 0) {
			int pos = 0;
			Node currentNode = headNode;
			nodes[pos] = currentNode;
			Node nextNode;
			do {
				nextNode = currentNode.getNextNode();
				if (nextNode != null) {
					currentNode = currentNode.getNextNode();
					pos++;
					nodes[pos] = currentNode;
				}

			} while (nextNode != null);

		}
		return nodes;

	}

	public void swapNodes(int pos1, int pos2) {
		int[] values = getValues();
		Node[] nodes = getNodes();
		int size = getSize();
		int temp = values[pos1];
		values[pos1] = values[pos2];
		values[pos2] = temp;
		for (int i = 0; i < size; i++) {
			System.out.println(values[i]);
			System.out.println(nodes[i]);
		}

	}

	public void intersection(int[] values, int[] values1) {
		int size = getSize();
		for (int i = 0; i < size; i++) {
			if (values[i] == values1[i]) {
				System.out.println("intesection at :" + i);
			}
		}
	}

	public void unsortedIntersection(int[] values, int[] values2) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (values[i] == values2[j]) {
					System.out.println("intesection at :" + i + "," + j);
				}
			}

		}
	}

	public void pairWiseSwap(int[] values4) {
		for (int i = 0; i < 4; i = i + 2) {

			int temp = values4[i];
			values4[i] = values4[i + 1];
			values4[i + 1] = temp;
			System.out.println(values4[i] + "," + values4[i + 1]);

		}
	}

	public void searchElement(int key) {
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode.getData() == key) {
				System.out.println("Element found ");
			}
			currentNode = currentNode.nextNode;
		}
	}

	public int getCount(int number) {
		int count = 0;
		Node currentNode = headNode;
		while (currentNode != null) {
			int data = currentNode.getData();
			if (data == number) {
				count++;
			}
			currentNode = currentNode.nextNode;
		}
		return count;
	}

	public int getLoopCount() {
		int loopCount = getSize();
		return loopCount;
	}

	public void getNode(int index) {
		Node currentNode = headNode;
		int count = 0;
		while (currentNode != null) {
			count++;
			if (count == index) {
				System.out.println("kth node is node" + count);
			}
			currentNode = currentNode.nextNode;
		}
	}

}
