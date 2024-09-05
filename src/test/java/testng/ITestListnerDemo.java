package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("this test is start "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		//
	System.out.println("this test is passed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case is failed "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	

	
	
	

}
