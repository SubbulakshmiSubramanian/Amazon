package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourAddress {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(op); 
		
		driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(1000);
		driver.findElement(By.id("ap_email")).sendKeys("subbulakshmi.csg@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ap_password")).sendKeys("Nethra@10");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(1000);
		Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Your Account']")).click();
        driver.findElement(By.xpath("//h2[contains(text(),'Your Addresses')]")).click();
        driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]")).click();
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']")).sendKeys("sudhass");
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']")).sendKeys("233345677");
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']")).sendKeys("4 silver Maple court");
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']")).sendKeys("1401");
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressCity']")).sendKeys("Brampton");
        Select obj=new Select(driver.findElement(By.xpath("//select[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId']")));
        obj.selectByVisibleText("Ontario");
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']")).sendKeys("L6T 4R2");
        driver.findElement(By.xpath("//input[@id='address-ui-widgets-use-as-my-default']")).click();
        driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/span[1]/span[1]/span[1]/input[1]")).click();
}
}
