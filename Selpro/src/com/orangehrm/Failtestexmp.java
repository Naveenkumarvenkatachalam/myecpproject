package com.orangehrm;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failtestexmp implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		int failedcount=0;
		int repeat = 4;
		if(failedcount<repeat)
		{
			failedcount++;
			return true;
		}
		return false;
	}

}
