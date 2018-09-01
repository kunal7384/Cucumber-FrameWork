package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.ConfigFileReader;
import managers.FileReaderManager;

public class HomePage {
	
	public static WebDriver driver;
	ConfigFileReader config;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	      config = new ConfigFileReader();
	     
	}
	
	public void navigate_url() throws InterruptedException
	{
		
		
		    System.out.println("start");
		  //  driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		    driver.get(FileReaderManager.getInstance().getConfigReader().getApllicationUrl());
            System.out.println("Testing ");
           
        //  driver.get("https://www.google.com/");

		
	}
	

}
