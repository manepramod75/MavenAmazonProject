package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{

	int initialcount = 0;
	int maximumcount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if (initialcount<maximumcount)
		{
			initialcount++;
			return true;
			
		}

		    return false;
	}

}
