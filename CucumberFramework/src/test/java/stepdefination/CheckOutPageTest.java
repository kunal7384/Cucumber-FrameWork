package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import checkoutpage.CheckOut;
import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class CheckOutPageTest {
	WebDriver driver;
	TestContext testContext;
	CheckOut chek;
	
	public CheckOutPageTest(TestContext context)
	{
		testContext=context;
		
		chek = testContext.getPageObjectManager().getcheckoutpage();
		
		
	}
	
	@When("^moves to checkout from mini cart$")
	public void moves_to_checkout_from_mini_cart() throws Throwable {
	  
	   chek.fill_personDetail();
	   chek.click_diff_add();
	 //  chek.click_terms();
	   chek.placeorder();
	   chek.error();
	
}
	
	@When("^enter personal details on checkout page$")
	public void enter_personal_details_on_checkout_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Done");
		
	  
	}

	@When("^select same delivery address$")
	public void select_same_delivery_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Done");
	}

	@When("^select payment method as “check” payment$")
	public void select_payment_method_as_check_payment() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Done");
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Done");
	}

}