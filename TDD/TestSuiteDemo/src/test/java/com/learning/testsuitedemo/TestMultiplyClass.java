package com.learning.testsuitedemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplyClass {

	MultiplyClass multiClass=new MultiplyClass();
	
	@Test
	public void testMultiply() {
		
		int val=multiClass.multiplyNums(5,7);
		assertEquals(35, val);
	}

}
