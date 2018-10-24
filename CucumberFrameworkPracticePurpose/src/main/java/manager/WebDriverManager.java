package manager;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.After;
import enums.DriverType;
import enums.EnviormentType;


public class WebDriverManager {
	
	private static WebDriver driver;
	private static DriverType driverType;
	private static EnviormentType environmentType;
	
 
	public WebDriverManager() throws IOException {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		environmentType = FileReaderManager.getInstance().getConfigReader(). getEnvironment();
	}
 
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}
	public WebDriver createDriver() {
		   switch (environmentType) {	    
	        case LOCAL : driver = createLocalDriver();
	        	break;
	        case REMOTE : driver = createRemoteDriver();
	        	break;
		   }
		   return driver;
	}
 
	public WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}
 
	public WebDriver createLocalDriver() {
        switch (driverType) {	    
        case FIREFOX : driver = new FirefoxDriver();
	    	break;
        case CHROME : 
        	
        	driver = new ChromeDriver();
    		break;
        case INTERNETEXPLORER : driver = new InternetExplorerDriver();
    		break;
        }
		return driver;
 
        
	}	
 

	public void closeDriver() {
		driver.close();
	
	}
	

}
