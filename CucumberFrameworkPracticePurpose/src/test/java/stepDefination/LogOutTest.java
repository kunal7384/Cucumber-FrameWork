package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LogOut;

public class LogOutTest {

	TestContext testContext;
	LogOut logout;
	
	
	
	
	public LogOutTest(TestContext context)
	{
		
	testContext = context;
	logout = testContext.getPageObjectManager().getlogout();
		
		
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	   
	 
	
	  logout.logout_app();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
     System.out.println("=============UserLogOut Successfully ======================");
  
	}

}
