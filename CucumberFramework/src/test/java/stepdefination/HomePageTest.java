package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import homepage.HomePage;
import managers.FileReaderManager;

public class HomePageTest {
   public static  WebDriver driver;
	TestContext testContext;
	HomePage home;
	
	public HomePageTest(TestContext context) {
	
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
	}
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		    home.navigate_url();
		    
		
		


}
	
	
}