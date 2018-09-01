package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import homepage.HomePage;
import productlistingpage.ProductListing;

public class ProductListingpageTest {
	
	public  static WebDriver driver;
		TestContext testContext;
		HomePage home;
	    ProductListing productlist;
	  
	    
	public ProductListingpageTest(TestContext context)
	{
		testContext = context;
	   productlist = testContext.getPageObjectManager().getProductListing();
		
	}
	
	@When("^he search for dress$")
	public void he_search_for_dress() throws InterruptedException  {
		
		productlist.search_productlist();
	    productlist.selected_product_title();
	    productlist.product_quntity();
	    productlist.add_product_tocard();
	}
}