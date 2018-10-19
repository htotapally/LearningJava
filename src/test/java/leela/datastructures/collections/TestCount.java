package leela.datastructures.collections;

import org.junit.Test;

public class TestCount {
	@Test
	public void estCount()
	{
		LinkedList linkedList = new LinkedList();	
		Node tailNode;
				
		Node node1 = new Node(20, null);	
		linkedList.addNode(node1);
		tailNode = linkedList.getTailNode();
		
		Node node2 = new Node(20, null);		
		linkedList.addNode(node2);
		tailNode = linkedList.getTailNode();
		
		Node node3 = new Node(40, null);
		linkedList.addNode(node3);
		tailNode = linkedList.getTailNode();
		
		int size = linkedList.getSize();
		
		int number = 20;
	    int count = linkedList.getCount(number);
	    System.out.println("no of occurences : "+count);
	}

}
