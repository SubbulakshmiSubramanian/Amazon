package testLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import baseamazon.BaseAmazonClass;
import pompackage.PomSignin;
import testdata.ExcelSheet;

public class SigninTest extends BaseAmazonClass{
		
		PomSignin Sign;
		
		public SigninTest()
		{
			super();
			System.out.println("SigninTest constructor. executed super()");
		}
	@BeforeMethod
	public void initsetup() throws InterruptedException 
	{
		initiate();
		System.out.println("initiated");
		Thread.sleep(2000);
		//screenshots("Login");
		
		Sign=new PomSignin();
	}
	@Test(priority=1)
	public void Title()
	{
		String actual=Sign.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon Sign In");
	}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=ExcelSheet.readdata("Sheet1");
		return result;
		
	}
	@Test(priority=2, dataProvider="Details")
	public void Signin(String Email, String Password) throws InterruptedException
	{
		Sign.typeemail(Email);
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		Sign.typepassword(Password);
		//Sign.clickbtn();
		Thread.sleep(1000);
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
