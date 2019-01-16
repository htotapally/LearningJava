package leela.datastructures.collections;

import java.util.Scanner;

import org.junit.Test;

public class TestStackReversal {
	@Test
	public void testStackReversal()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter String");
		String string = scanner.next();
		StackReversal.stackReversal(string);
	}

}
