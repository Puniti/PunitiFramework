package Factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	
	public static WebDriver startApplication(String appURL , String browserName)
	{ 
		WebDriver driver= null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{ ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
		driver=new ChromeDriver(options);
			
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\dell\\Desktop\\Selenium setup\\geckodriver.exe ");
			 driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\dell\\Desktop\\Selenium setup\\IEDriverServer.exe ");
			 driver = new InternetExplorerDriver();
		}
		else
		{
			
			System.out.println("We only support chrome, firefox, IE .");
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	public static void closeApplication(WebDriver driver)
	{
		driver.quit();
	}
	
	
}
