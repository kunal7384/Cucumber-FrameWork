package stepDefination;

import java.awt.List;
import java.io.IOException;

import org.apache.bcel.classfile.PMGClass;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class LoginTest {
	WebDriver driver;
	TestContext testContext;
	Login logintests;
	
	
	
	public LoginTest(TestContext context) throws IOException
	{
		testContext = context;
		logintests  =testContext.getPageObjectManager().gethomePage();
	
	
	}
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logintests.getAppurl();
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	  System.out.println("Enter USer name and password");
	}
	
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   logintests.enter_Login_detail();
	   logintests.userclick();
	   
	}


   /*@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password(DataTable testdata) throws Throwable {
	   
		 Write code here that turns the phrase above into concrete actions
		  logintests.user_enters_UserName_and_Password(testdata);
		logintests.userclick();
	}*/
	
/*	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    logintests.user_enters_and(username, password);
	    logintests.userclick();
	}*/


	  
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Login Sucessfully");

	}


}
