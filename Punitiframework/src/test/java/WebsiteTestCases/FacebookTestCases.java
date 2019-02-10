package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.ConfigProviderFactory;
import Factory.DataProviderFactory;
import Factory.ExcelDataProvider;
import WebsitePages.LoginPage;

public class FacebookTestCases {
	WebDriver driver;
	LoginPage log;

	@Test
	public void loginFb() {

		log = PageFactory.initElements(driver, LoginPage.class);
		log.login(DataProviderFactory.getExcel().getStringData("Login", 0, 1),
				DataProviderFactory.getExcel().getStringData("Login", 0, 1));

	}

}
