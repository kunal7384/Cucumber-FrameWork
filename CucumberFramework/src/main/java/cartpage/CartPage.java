package cartpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	public  static WebDriver driver;
	@FindBy(xpath="//*[@class='button wc-forward']")
	WebElement view_card ;
	
//	@FindBy(xpath="//*[@class='cart_totals calculated_shipping']")
//	WebElement card_totle;
	
	@FindBy(xpath="//*[@class='checkout-button button alt wc-forward']")
	WebElement proced_checkout;
	
	public CartPage(WebDriver driver)
	{
		this .driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void click_view_card()
	{
		view_card.click();
		
		
	}
	
	public void check_for_checkout()
	{
		
	//	String totle_detail = card_totle.getText();
		//System.out.println("Card totle detail is ::"+ totle_detail);
		
		proced_checkout.click();
		
	}

}



