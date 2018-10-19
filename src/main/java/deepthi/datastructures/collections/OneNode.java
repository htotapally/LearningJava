package deepthi.datastructures.collections;

public class OneNode {
	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		Node node = new Node(10, null);
		linkedList.addNode(node);
		int size = linkedList.getSize();
		System.out.println(size);
		int[] values = new int[size];
		System.out.println("Values in the linkedList are :");
		values = linkedList.getValues();
	}
}
