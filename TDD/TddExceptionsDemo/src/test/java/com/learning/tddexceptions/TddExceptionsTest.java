package com.learning.tddexceptions;

import static org.junit.Assert.*;

import org.junit.Test;

public class TddExceptionsTest {

	TddExceptions tdd=new TddExceptions();
	
	@Test(expected = ArithmeticException.class)
	public void exceptionTest() {
		double ans=tdd.divide(5,0);
	}

}
