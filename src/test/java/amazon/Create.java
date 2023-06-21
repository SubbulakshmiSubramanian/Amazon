package amazon;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(op); 
		driver.get("https://www.amazon.ca");
		Thread.sleep(5000);
		Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
        action.moveToElement(driver.findElement(By.partialLinkText("Start her"))).click().build().perform();

		
	driver.findElement(By.id("ap_customer_name")).sendKeys("sudha");
	driver.findElement(By.id("ap_email")).sendKeys("subbulakshmi.csg@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("Welcome123");
	driver.findElement(By.id("ap_password_check")).sendKeys("Welcome123");
	driver.findElement(By.id("continue")).click();		
		

	}

}
