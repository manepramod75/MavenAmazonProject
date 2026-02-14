package SmokeTC_Maven.Amazon01;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseClass;
import utility.RetryLogic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2_login_SearchTheProduct_LogOut extends BaseClass{

	@Test(retryAnalyzer=RetryLogic.class)
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
		SearchTheProductandLogOut s1= new SearchTheProductandLogOut (driver);
		s1.searchTheProduct();
		p1.howoveronAccountlist(driver);
		s1.Logoutapp();
		Reporter.log("Logoutdone");
		
		
		
	}

}
 