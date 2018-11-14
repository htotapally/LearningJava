package leela.datastructures.collections;

import org.junit.Test;

public class TestPostFixEvaluation {
	@Test
	public void testPostFix()
	{
		String exp = "23+34+*7-";
		int result = PostFixEvaluation.postFixEvaluation(exp);
		System.out.println(result);
	}

}
