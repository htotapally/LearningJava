package deepthi.datastructures.collections;

public class LinkedList {

	private Node headNode;

	public void addNode(Node node) {

Node tailNode = getTailNode();

		if (tailNode == null) {

			headNode = node;

		}

		else {

			tailNode.setNextNode(node);

		}

	}

	public Node getTailNode() {

		Node tailNode = null;

		if (headNode == null) {

			tailNode = null;

		}

		else {

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

	public int getSize() {

		int count = 0;

		if (headNode == null)

		{

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

			}

			while (nextNode != null);

		}

		return count;

	}

	public int printNode(int index)

	{

		Node currentNode = headNode;

		int count = 0;

		while (currentNode != null)

		{

			count++;

			if (count == index)

			{

				System.out.println("nth node is node" + count);

			}

			currentNode = currentNode.nextNode;

		}

		return count;

	}

	public int printEndNode(int index, int size)

	{

		int value = size - index;

		Node currentNode = headNode;

		int count = 0;

		while (currentNode != null)

		{

			count++;

			if (count == value)

			{

				System.out.println("nth node from end  is node" + count);

			}

			currentNode = currentNode.nextNode;

		}

		return count;

	}

	public Node[] getNodes() {

		int size = getSize();

		Node[] nodes = new Node[size];

		Node currentNode;

		currentNode = headNode;

		Node nextNode = currentNode.getNextNode();

		int currentPosition = 0;

		nodes[currentPosition] = currentNode;

		while (nextNode != null) {

			currentPosition++;

			currentNode = currentNode.getNextNode();

			if (currentPosition <= 2) {

				nodes[currentPosition] = currentNode;

			}

			nextNode = currentNode.getNextNode();

		}

		for (Node a : nodes)

			System.out.println(a);

		return nodes;

	}

	public int[] getValues()

	{

		int size = getSize();

		int[] values = new int[size];

		if (size > 0)

		{

			int pos = 0;

			Node currentNode = headNode;

			values[pos] = currentNode.getData();

			Node nextNode;

			do

			{

				nextNode = currentNode.getNextNode();

				if (nextNode != null)

				{

					currentNode = currentNode.getNextNode();

					pos++;

					values[pos] = currentNode.getData();

				}

			} while (nextNode != null);

		}

		for (int a : values)

			System.out.println(a);

		return values;

	}

	public void printValues() {

		Node currentNode = headNode;

		while (currentNode != null) {

			System.out.println(currentNode.getData());

			currentNode = currentNode.nextNode;

		}

		headNode = null;

	}

}
