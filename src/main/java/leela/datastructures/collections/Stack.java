package leela.datastructures.collections;

public class Stack {
	int max = 20;
	int[] array = new int[20];
	int top = -1;

	public void push(int x) {
		top = top + 1;
		array[top] = x;
		System.out.println("element pushed into the stack is : " + x);
	}

	public int pop() {
		top = top - 1;
		int popElement = array[top+1];
		return popElement;
	}

	public int top() {
		return top;
	}
	
	public int topElement()
	{
		return array[top];
	}

	public void isEmpty() {
		if (top == -1) {
			System.out.println("Stack is empty");
		}
	}
}
