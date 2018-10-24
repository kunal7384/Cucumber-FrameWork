package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configreader.ConfigReader;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import freemarker.core.FMParser;
import manager.FileReaderManager;

public class Login {
	public WebDriver driver;
	ConfigReader cf;
	FileReaderManager fm;
	@FindBy(id="username_or_email")
	public static WebElement userid;
	
	@FindBy(id="login_password")
	public static WebElement userpass;
	
	@FindBy(name="commit")
	public static WebElement loginclick;
	
	
	public Login(WebDriver driver) throws IOException
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		ConfigReader cf = new ConfigReader();
		
	}
	
	public void enter_userid(String uid)
	{
		userid.sendKeys(uid);
		
	}
	   
	public void enter_userpass(String upass)
	{
		userpass.sendKeys(upass);
		
		
	}
	
	/*@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password(DataTable testdata) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		java.util.List<java.util.List<String>> data = testdata.raw();
		//userid.sendKeys(data.get(0).get(0));
	//	userpass.sendKeys(data.get(0).get(1));
		userid.sendKeys(data.get(1).get(0));
		userpass.sendKeys(data.get(1).get(1));
	}*/
	
/*	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		userid.sendKeys(username);
		userpass .sendKeys(password);
		
		
	}*/


	
	
	public void userclick()
	{
		
		loginclick.click();
		
	}
	
	
	public void enter_Login_detail()
	{
		 
		    enter_userid("bhavesh");
		    enter_userpass("password");
	
		
	}
	
	
	public void getAppurl() throws IOException
	{
		
		     
		 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	            driver.get(FileReaderManager.getInstance().getConfigReader().getUrl());
			
		
		
		
	}

	
		
}
