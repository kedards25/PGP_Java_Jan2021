package com.learning.testsuitedemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestAddClass.class, TestMultiplyClass.class, TestSubtractClass.class })
public class TestAllOps {

}
