package stepDefination;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateStudent;
import pages.Login;

public class CreateStudentTest {
	CreateStudent create;
	Login logintests;
	TestContext testContext;
	
	
	public CreateStudentTest(TestContext context)
	{
		
		testContext= context;
		
		create = testContext.getPageObjectManager().getStudent();
	}
    
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("User is on login page"); 
	}
	@When("^User click on create user link$")
	public void user_click_on_create_user_link() throws Throwable {
	  
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
	
	
}
