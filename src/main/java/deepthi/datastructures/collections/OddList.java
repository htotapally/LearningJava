package deepthi.datastructures.collections;

public class OddList {
	public static void main(String args[]) {

		LinkedList myLinkedList = new LinkedList();

		Node node = new Node(20, null);

		myLinkedList.addNode(node);

		node = new Node(33, null);

		myLinkedList.addNode(node);

		node = new Node(45, null);

		myLinkedList.addNode(node);

		node = new Node(55, null);

		myLinkedList.addNode(node);

		node = new Node(88, null);

		myLinkedList.addNode(node);

		int size = myLinkedList.getSize();
		System.out.println("The size of the linkedList is:");

		System.out.println(size);

		LinkedList oddLinkedList = new LinkedList();

		int[] values = new int[size];
		System.out.println("Values in the linkedList are :");
		values = myLinkedList.getValues();

		int i;

		for (i = 0; i < size; i++) {

			if (values[i] % 2 != 0) {
				Node node1 = new Node(values[i], null);

				oddLinkedList.addNode(node1);

			}

		}
		System.out.println("Values in the Odd LinkedList are :");
		values = oddLinkedList.getValues();

	}
}
