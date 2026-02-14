package SmokeTC_Maven.Amazon01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTheProductandLogOut 
{
	WebDriver driver;
	
	@FindBy (id = "twotabsearchtextbox")
	WebElement search;
	
	@FindBy (xpath = "//span[text()='Sign Out']")
			WebElement logout;

	
	public void searchTheProduct()
	{
		search.sendKeys("Locker"+Keys.ENTER);
	}
 	 public void Logoutapp () 
 	 {
 		logout.click(); 
 	 }
 	 
 	 public SearchTheProductandLogOut(WebDriver driver)
 	 {
 		 PageFactory.initElements(driver, this);
 	 }
 	 
}