package com.itestlisners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCasesListners {
	 
	@Test
	void testcase1() {
		Assert.assertTrue(false);
	}
	
	@Test
	void testcase2() {
		Assert.assertTrue(true);
	}
	
	@Test
	void testcase3() {
		throw  new SkipException(" ");
	}
}
