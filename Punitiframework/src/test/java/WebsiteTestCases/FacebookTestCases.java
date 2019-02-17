package WebsiteTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Factory.BrowserFactory;
import Factory.ConfigProviderFactory;
import Factory.DataProviderFactory;
import Factory.ExcelDataProvider;
import WebsitePages.BaseClass;
import WebsitePages.LoginPage;

public class FacebookTestCases {
	WebDriver driver;
	LoginPage log;
    BaseClass base;
	@Test
	public void loginFb() {
        base= PageFactory.initElements(driver, BaseClass.class);
        base.setup();
		log = PageFactory.initElements(driver, LoginPage.class);
		log.login(DataProviderFactory.getExcel().getStringData("Login", 0, 1),
				DataProviderFactory.getExcel().getStringData("Login", 0, 1));

	}

}
