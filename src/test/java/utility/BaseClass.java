package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass extends ListenerLogic
{
	public WebDriver driver;	
	@Parameters ("browserName")
	@BeforeMethod 
	public void browserLaunch(String whichBrowser)
	{
		if (whichBrowser.equals("chrome"))
		{
			driver= new ChromeDriver();	
		}
		if (whichBrowser.equals("edge"))
		{
			driver= new EdgeDriver();	
		}
		if (whichBrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void browserQuite() throws InterruptedException
	{
	Thread.sleep(3000);
	driver.quit();
	}


}
