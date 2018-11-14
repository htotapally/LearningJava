package leela.datastructures.collections;

import org.junit.Test;

public class TestStack {
	@Test
	public void testStack()
	{
		Stack stack = new Stack();
		stack.push(3);
		stack.push(4);
		stack.push(5);
		int popElement = stack.pop();
		System.out.println("popped Element : " + popElement);
		int top = stack.top();
		System.out.println("top index of stack is :" + top);
		int topElement = stack.topElement();
		System.out.println("top element :" + topElement);
		stack.isEmpty();
	}

}
