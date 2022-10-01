package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest1 {

	@Test
	public void evaluatesExpression() {

		Prime prime = new Prime();
		String s = prime.isPrime(13);
		assertEquals("prime", s);

	}

}
