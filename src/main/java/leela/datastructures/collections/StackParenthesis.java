package leela.datastructures.collections;

public class StackParenthesis {
	public void checkPara(String exp)
	{
		Stack stack = new Stack();
		for(int i = 0; i < exp.length();i++)
		{
			char c = exp.charAt(i);
			stack.push(c);
		}
	}

}
