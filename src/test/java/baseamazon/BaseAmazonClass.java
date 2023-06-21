package baseamazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseAmazonClass {
	public static Properties prop=new Properties();
	public static WebDriver driver; 
	//step1
	public BaseAmazonClass() 
	{
		try
		{
			System.out.println("Before FIleinputstream");
		FileInputStream file=new FileInputStream("C:\\Users\\subbu\\OneDrive\\Documents\\Amazonproject\\src\\test\\java\\environmentvariables\\config.properties");
		prop.load(file);
		System.out.println("After FIleinputstream");
	    }
		catch(FileNotFoundException e )
		{
			System.out.println("FileNotFoundException happened");
			e.printStackTrace();
		}
		catch(IOException a)
		{
			System.out.println("IOException happened");
			a.printStackTrace();
		}
	}
	
	//step2
	
			public static void initiate()
			{
				String browsername=prop.getProperty("browser");
				if(browsername.equals("Firefox"))
				{
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
					FirefoxOptions op=new FirefoxOptions();
					op.setBinary("C:\\Program Files\\Mozilla Firefox/firefox.exe");
					//op.addArguments("--remote-allow-origins=*");
					driver=new FirefoxDriver(op);
				}
				else if(browsername.equals("chrome"))
				{
					
					System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
					ChromeOptions op=new ChromeOptions();
					op.addArguments("--remote-allow-origins=*");
					driver=new ChromeDriver(op); 
				}
					
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(prop.getProperty("url"));
			}
				
}
