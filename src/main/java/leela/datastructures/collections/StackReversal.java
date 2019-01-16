package leela.datastructures.collections;

public class StackReversal {
	public static void stackReversal(String string)
	{
		Stack stack = new Stack();
		for(int i = 0 ; i < string.length(); i++)
		{
			char ch = string.charAt(i);
			stack.push(ch);
		}
		for(int i = string.length(); i >=  0 ; i--)
		{
			System.out.println(stack.pop());
		}
	}

}
