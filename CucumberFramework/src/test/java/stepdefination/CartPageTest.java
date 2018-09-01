package stepdefination;

import cartpage.CartPage;
import cucumber.TestContext;
import cucumber.api.java.en.When;

public class CartPageTest {
	
	TestContext testContext;
	CartPage cart;
	
	
	public CartPageTest(TestContext context)
	{
		testContext = context;
		cart = testContext.getPageObjectManager().getCartPage();
		
	}
   
	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
	  cart.click_view_card();
	  cart.check_for_checkout();
	}
	
	
	
}
