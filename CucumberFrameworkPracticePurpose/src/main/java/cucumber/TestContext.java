package cucumber;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import manager.PageObjectManager;
import manager.WebDriverManager;

public class TestContext {
	
	public static WebDriver driver;
	 PageObjectManager pm;
	 WebDriverManager wm;
	public TestContext() throws IOException{
		wm = new WebDriverManager();
	pm = new PageObjectManager(wm.getDriver());
	}
	public WebDriverManager getWebDriverManager() {
		return wm;
	}
	public PageObjectManager getPageObjectManager() {
		return pm;
	}

}
