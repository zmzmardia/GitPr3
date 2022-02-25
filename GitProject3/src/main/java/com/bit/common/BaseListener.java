package com.bit.common;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BaseListener implements ITestListener{
	// to execute this class we need listener xml file
	public WebDriver dr;

	public void onTestStart(ITestResult result) {
		 if(result.getStatus() == ITestResult.STARTED) {
			   System.out.println(result.getName() + " is started");
		   }
	
	}

	public void onTestSuccess(ITestResult result) {
		int status = result.getStatus();
		int success = ITestResult.SUCCESS;
	  if(status == success) {
		 String testname = result.getName();
		 System.out.println(testname + " is successed");
	  }
		
	}

	public void onTestFailure(ITestResult result) {
		int status = result.getStatus();
		int fail = ITestResult.FAILURE;
	  if(status == fail) {
		 String testname = result.getName();
		 System.out.println(testname + " screenShot of failure");
		 
	  }
		
	}

	public void onTestSkipped(ITestResult result) {
	   if(result.getStatus() == ITestResult.SKIP) {
		   System.out.println(result.getName() + " is skipped");
	   }
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String testName = context.getName();  // this test name means which one is under the suite tag
		System.out.println(testName + " is started");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		String testName = context.getName(); // this test name means which one is under the suite tag
		System.out.println(testName + " is finished");
	}

}
