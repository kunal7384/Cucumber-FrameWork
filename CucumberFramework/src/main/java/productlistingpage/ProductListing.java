package productlistingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.ConfigFileReader;

public class ProductListing {
	
	public static WebDriver driver;
	ConfigFileReader config;
	
	@FindBy(xpath="//*[text()='39MM MESH BRACELET WATCH']")
	public static WebElement search_product;
	
	@FindBy(xpath="//*[@class='product_title entry-title']")
	public static WebElement product_title;
	
	@FindBy(xpath="//*[@class='product_information_row_inner open']")
	public static WebElement product_discription;
	
	@FindBy(xpath="//*[@title='Qty']")
	public static WebElement product_qty;
	
	@FindBy(xpath="//*[@class='single_add_to_cart_button button alt']")
	public static WebElement add_to_card;
	
	
	public ProductListing(WebDriver driver)
	{ 
		         this.driver= driver;
		         PageFactory.initElements(driver, this);
	           
	}
	
    public void search_productlist()
{             
    	
    	     
    	    System.out.println("Product List Method To check");
	        search_product.click();
	   
}

        public void selected_product_title()
{
	          String title =product_title.getText();
	          System.out.println("Title of Selected Product is ::"+title);
	          String description = product_discription.getText();
	          System.out.println("Description of selected produt is given below::"+description);

}

public void product_quntity()
{
	product_qty.clear();
	product_qty.sendKeys("1");

}
 public void add_product_tocard()
 {
	 
	 add_to_card.click();
	 
 }

}
