package stepDefination;

import java.io.IOException;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SearchUser;

public class SearchStudentTest {
	
	TestContext testContext;
	SearchUser search;
	
	
          public SearchStudentTest(TestContext context) throws IOException
     {
	
        	 testContext= context;
        	 search=testContext.getPageObjectManager().getsearchStudent();
        	  
        	  
        }
          
          
          @When("^we enter value for searching$")
      	public void we_enter_value_for_searching() throws Throwable {
      	    // Write code here that turns the phrase above into concrete actions
      		
      		search.search_Student();
      		Thread.sleep(6000);
      		search.get_All_Teachers();
      		
      	}

      	@Then("^Should display search user$")
      	public void should_display_search_user() throws Throwable {
      	    // Write code here that turns the phrase above into concrete actions
      	   System.out.println("fff");
}
}