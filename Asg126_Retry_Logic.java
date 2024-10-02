package assignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Asg126_Retry_Logic implements IRetryAnalyzer
{

	int actualcount = 0;
	int retrycount = 2;
	
	
	public boolean retry(ITestResult result) {
		if(actualcount<retrycount) 
		{
			actualcount++;
			return true;
		}
		
		return false; 
	}

}
