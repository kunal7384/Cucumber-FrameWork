package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	@FindBy(xpath="//*[@class='user-avtar']")
	WebElement logoutlink;
	
	@FindBy(xpath="//*[@href='/logout']")
	WebElement txtlogout;


	public LogOut(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void logout_app()
	{
		logoutlink.click();
		txtlogout.click();
		
		
	}
}
