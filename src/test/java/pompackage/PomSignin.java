package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseamazon.BaseAmazonClass;

public class PomSignin extends BaseAmazonClass{
	@FindBy(id="ap_email") WebElement Email;
	@FindBy(id="continue") WebElement Continue;
	@FindBy(id="ap_password") WebElement Password;
	@FindBy(id="signInSubmit") WebElement Signin;
	public PomSignin() 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void typeemail(String email)
	{
		Email.sendKeys(email);
	}	
	public void clickbtncontinue()
	{
		Continue.click();
	}
	public void typepassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickbtn()
	{
		Signin.click();
	}
	public String verify()
	{
		return driver.getTitle();
	}
}
