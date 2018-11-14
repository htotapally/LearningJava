package leela.datastructures.collections;

public class PostFixEvaluation {
	public static int postFixEvaluation(String exp) {
		Stack stack = new Stack();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (Character.isDigit(ch)) {
				ch = exp.charAt(i);
				stack.push(ch);
			}

			else {
				int op1 = stack.pop();
				int op2 = stack.pop();
				switch (ch) {
				case '+':
					stack.push(op2 + op1);
					break;
				case '-':
					stack.push(op2 - op1);
					break;
				case '*':
					stack.push(op2 * op1);
					break;
				case '/':
					stack.push(op2 / op1);
					break;
					
				}
			}

		}
		return stack.pop();
	}

}
