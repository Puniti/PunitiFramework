package UnitTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.ConfigProviderFactory;

public class TestBrowserFactory {
  
   String url= "https://www.facebook.com";
  
   WebDriver driver;
   ConfigProviderFactory config= new ConfigProviderFactory();
   
   
   @Test
	public void TestChromeBrowser()
	{
	   WebDriver driver=BrowserFactory.startApplication(url, config.getBrowser1());
		BrowserFactory.closeApplication(driver);
	}
   @Test
   public void TestFirefoxBrowser()
	{
	    driver =BrowserFactory.startApplication(url, config.getBrowser2());
		BrowserFactory.closeApplication(driver);
	}
   @Test
   public void TestIEBrowser()
	{
	 driver=BrowserFactory.startApplication(url, config.getBrowser3());
		BrowserFactory.closeApplication(driver);
	}
   
   
}
