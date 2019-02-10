package WebsitePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id="email") WebElement uname;
	@FindBy(id="pass") WebElement password;
	@FindBy(id="u_0_2") WebElement Login;
	
	
	public void login (String user , String pass)
	{
		
		uname.sendKeys(user);
		password.sendKeys(pass);
		Login.click();
		
	}
	public void EnterUser ()
	{
		
		uname.sendKeys("chunmun.testing@gmail.com");

		
	}
	public void EnterPass ()
	{
		
		password.sendKeys("puniti09");
		
	}
	public void EnterLogin ()
	{
		Login.click();
		
	}
	
	
}
