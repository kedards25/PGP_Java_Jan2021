package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubtractClass {

	SubtractClass subClass=new SubtractClass();
	
	@Test
	public void testSubtract() {
		
		int res=subClass.subtract(7,5);
		assertEquals(3, res);
		
	}

}
