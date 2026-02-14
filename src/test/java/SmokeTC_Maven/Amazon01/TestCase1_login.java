package SmokeTC_Maven.Amazon01;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.RetryLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1_login extends BaseClass{

	@Test (retryAnalyzer = RetryLogic.class)
	public void Loginwithvaliduser() throws InterruptedException {	
		Thread.sleep(5000);
		HomePageAmazon p1 = new HomePageAmazon(driver);
		p1.howoveronAccountlist(driver);
		p1.clickonsignin();
		Thread.sleep(2000);
		p1.entervalidusername();
		Thread.sleep(2000);
		p1.continuebutton();
		Thread.sleep(5000);
		p1.entervalidpassword();
		Thread.sleep(2000);
		p1.clickonSignin();
		
		
		
	}

}
 