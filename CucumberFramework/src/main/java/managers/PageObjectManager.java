package managers;

import org.openqa.selenium.WebDriver;

import cartpage.CartPage;
import checkoutpage.CheckOut;
import homepage.HomePage;
import productlistingpage.ProductListing;

public class PageObjectManager {
	
	
	public static WebDriver driver;
	public static  HomePage home;
	public static CartPage cart;
	public static ProductListing productlist;
	public static CheckOut chek;
	
	
	
	public PageObjectManager(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	
	public HomePage getHomePage()
	{
	return (home == null) ? home = new HomePage(driver) : home;
		
		
		
	}
	 
	public ProductListing getProductListing()
	{
		return (productlist==null) ? productlist = new ProductListing(driver) :productlist;
		
		
	}
	
	public CartPage getCartPage()
	{
		
	return (cart == null )	? cart = new CartPage(driver) : cart;
		
	}
	
	
      public CheckOut getcheckoutpage()
      {
    	  
    	  
    	  return (chek == null ) ? chek = new CheckOut(driver) : chek;
      }
      
      
      

}
