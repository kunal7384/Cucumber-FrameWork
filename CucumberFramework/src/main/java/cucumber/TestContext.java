package cucumber;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {
	/*public static WebDriver driver;
	public static PageObjectManager pm;
	
	
	public TestContext()
	{
		
		pm = new PageObjectManager(driver);
		
		
	}

	
	public PageObjectManager getpageObjectManager()
	{
		
		return pm;
		
		
	}*/
	public static WebDriver driver;
	 PageObjectManager pm;
	 WebDriverManager webDriverManager;
	public TestContext(){
		webDriverManager = new WebDriverManager();
	pm = new PageObjectManager(webDriverManager.getDriver());
	}
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	public PageObjectManager getPageObjectManager() {
		return pm;
	}
 

}
