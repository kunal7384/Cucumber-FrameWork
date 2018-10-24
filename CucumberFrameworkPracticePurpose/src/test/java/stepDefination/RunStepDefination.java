/*package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configreader.ConfigReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import manager.FileReaderManager;
import manager.PageObjectManager;
import manager.WebDriverManager;
import pages.CreateStudent;
import pages.LogOut;
import pages.Login;
import pages.SearchUser;

public class RunStepDefination {
	
	 static WebDriver driver;
	public static Login logintests;
	public static CreateStudent create;
	public static LogOut logout;
	public static SearchUser search;
	public static PageObjectManager pm;
	public static ConfigReader cf;
	public static FileReaderManager fm;
	public static WebDriverManager wm;
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager wm = new WebDriverManager();
		 driver =wm.getDriver();
		PageObjectManager pm = new PageObjectManager(driver);
			
			logintests=pm.gethomePage();
			logintests.getAppurl();
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
  //    String title = driver.getTitle();
    //  System.out.println("Title is " +title);
		System.out.println("gfgf");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 PageObjectManager pm = new PageObjectManager(driver);
		
		logintests.enter_Login_detail();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 logintests.userclick();
	}

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User is on login page"); 
	}

	@When("^User click on create user link$")
	public void user_click_on_create_user_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	// create = new CreateStudent(driver);
		pm = new PageObjectManager(driver);
		create= pm.getStudent();
	create.click_stu();
	}

	@When("^User should Fill all the Information$")
	public void user_should_Fill_all_the_Information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		create.fillstudent_Info();
	}

	@Then("^Student create Sucessfully$")
	public void student_create_Sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 create.submit_stu();
	 create.error();
	 
	 
	}
	
	
	
	@When("^we enter value for searching$")
	public void we_enter_value_for_searching() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		pm = new PageObjectManager(driver);
		 Thread.sleep(2000);
		search = pm.getsearchStudent();
		search.search_Student();
		
	}

	@Then("^Should display search user$")
	public void should_display_search_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("fff");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 // logout = new LogOut(driver);
		pm = new PageObjectManager(driver);
;
	  logout = pm.getlogout();
	  Thread.sleep(2000);
	  logout.logout_app();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
driver.close();
	}


}*/
