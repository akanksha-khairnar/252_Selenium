package com.itestlisners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case  is started "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test case is passed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case got failed "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case is skipped " +result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("======Execution of testcases are started=======" );
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("=====Execution of testcases are finished======");
	}
	
}
