package SmokeTC_Maven.Amazon01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class   HomePageAmazon  {
	//step 1 _ Locate the component by using @FindBy annotation 
	WebDriver driver;
	@FindBy(xpath = "//span[@class ='nav-line-2 ']")
	WebElement Accountandlist;
	
	@FindBy (xpath = "//span[@class='nav-action-inner']")
	WebElement SigninfromAccoutandList;
	
	@FindBy (id= "ap_email_login")
	WebElement enterusername;
	
	@FindBy (xpath ="//input[@class ='a-button-input']")
	WebElement clickcontinue;
	
	@FindBy (id = "ap_password")
	WebElement enterpassword;
	
	@FindBy (id = "signInSubmit")
	WebElement clicksignin;
	
	
	
	//step 2_Create separate method for each component to perform action 
	public void howoveronAccountlist(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(Accountandlist).perform();
	}
	public void clickonsignin() {
		SigninfromAccoutandList.click();		 
	}

	public void entervalidusername()
	{
	 enterusername.sendKeys("9975754750");
	 	
	}
	public void continuebutton()
	{
		clickcontinue.click();
	}
	
	public void entervalidpassword()
	{
		enterpassword.sendKeys("Amazonpp@75");
	}
	public void clickonSignin()
	{
		clicksignin.click();
	}
	
//step 3_ Initialize your component inside the constructor by using pagefactory class. 
	
	public HomePageAmazon(WebDriver driver) {
		
	PageFactory.initElements(driver, this); // here "this" keyword is used because _ global variable name is same as method parameter 
	}
}

