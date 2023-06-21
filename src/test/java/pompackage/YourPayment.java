package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class YourPayment {
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
        Thread.sleep(3000);
        Actions action=new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Your Account']")).click();
        System.out.println("clicked Your account");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Manage or add payment methods and view your transa')]")).click();
        System.out.println("clicked Manage or add payment methods");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='a-page']/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]/span[1]/input[1]")).click();
        System.out.println("clicked Add payment button");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Add a credit or debit card')]/preceding-sibling::input[@type='submit']")).click();
        System.out.println("clicked add card button");
        Thread.sleep(1000);
        System.out.println("before wait");
        Thread.sleep(4000);
        System.out.println("after wait");
//        WebElement label_card_number = driver.findElement(By.xpath("//label[contains(text(),'Card number')]"));
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@name='addCreditCardNumber']")).sendKeys("5123456789012346");
        System.out.println("gave card number");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='ppw-accountHolderName']")).sendKeys("Master Card");
        System.out.println("gave card name");
        Thread.sleep(1000);
        
        Select month = new Select(driver.findElement(By.xpath("//select[@name='ppw-expirationDate_month']")));
        month.selectByVisibleText("05");
        Thread.sleep(1000);
        Select year = new Select(driver.findElement(By.xpath("//select[@name='ppw-expirationDate_year']")));
        year.selectByVisibleText("2024");
        Thread.sleep(1000);

      driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:AddCreditCardEvent']")).click();
      
        
        
}
}