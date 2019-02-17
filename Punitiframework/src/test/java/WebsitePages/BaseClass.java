package WebsitePages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Factory.BrowserFactory;
import Factory.ConfigProviderFactory;
import Factory.DataProviderFactory;
//import com.aventstack.extentreports.ExtentReports;

public class BaseClass {
	public WebDriver driver;
	//public ExtentReports reports;

	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(DataProviderFactory.getConfig().getURL(),
				DataProviderFactory.getConfig().getBrowser1());

	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.closeApplication(driver);
	}
}
