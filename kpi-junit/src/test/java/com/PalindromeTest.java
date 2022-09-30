package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {


	@Test
	public void evaluatesExpression() {
		Palindrome n = new Palindrome();
		String num = n.evaluate("123");
		assertEquals("palindrome number",num);

	 

		
	}
	

}
