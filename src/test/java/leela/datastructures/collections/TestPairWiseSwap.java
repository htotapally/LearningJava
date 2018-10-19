package leela.datastructures.collections;

import org.junit.Test;

public class TestPairWiseSwap {
	@Test
	public void testPairWiseSwap()
	{
		 LinkedList linkedList4 = new LinkedList();
			
			Node node15 = new Node(2, null);
			linkedList4.addNode(node15);	

			Node node16 = new Node(3, null);
			linkedList4.addNode(node16);

			Node node17 = new Node(20, null);
			linkedList4.addNode(node17);
			
	        Node node18 = new Node(200, null);
			linkedList4.addNode(node18);
			
			int size = linkedList4.getSize();
			System.out.println("Before Swapping");
			int[] values4 = linkedList4.getValues();
			for(int i = 0 ; i < size; i++)
			{
				System.out.println(values4[i]);
			}
			System.out.println("After swapping");
			linkedList4.pairWiseSwap(values4);
	}

}
