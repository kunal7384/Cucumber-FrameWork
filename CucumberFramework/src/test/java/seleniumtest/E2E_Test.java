package seleniumtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_Test {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://shop.demoqa.com/product-tag/men/");
		WebElement select_product= driver.findElement(By.xpath("//*[text()='39MM MESH BRACELET WATCH']"));
		String select_product_title=select_product.getText();
		select_product.click()	;
		System.out.println("Selected Product is::"+select_product_title);
		
		WebElement product_info = driver.findElement(By.xpath("//*[@class='product_information_row_inner open']"));
	     String product_info_title=	product_info.getText();
	     System.out.println("Product Infornmation::"+product_info_title);
	     
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,600)");
	  
	  WebElement qty = driver.findElement(By.xpath("//*[@title='Qty']"));
	  qty.clear();
	  qty.sendKeys("1");
	  WebElement add_tocard= driver.findElement(By.xpath("//*[@class='single_add_to_cart_button button alt']"));
	  add_tocard.click();
	  WebElement viewcard = driver.findElement(By.xpath("//*[@class='icon_bag_alt']"));
	   Actions action = new Actions(driver);
	   action.moveToElement(viewcard).build().perform();
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	//  WebElement   addcard= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@class='text' and text()='Checkout']")));
	 //  addcard.click();
	   driver.findElement(By.xpath("//*[@class='button wc-forward']")).click();
	   
	   WebElement proceed_checkout = driver.findElement(By.xpath("//*[@class='checkout-button button alt wc-forward']"));
	   proceed_checkout.click();
	   
	   driver.findElement(By.id("billing_first_name")).clear();
	   driver.findElement(By.id("billing_first_name")).sendKeys("Kunal");
	   driver.findElement(By.id("billing_last_name")).clear();
	   driver.findElement(By.id("billing_last_name")).sendKeys("Dhote");
	   driver.findElement(By.id("billing_email")).clear();
	   driver.findElement(By.id("billing_email")).sendKeys("kunal7384@gmail.com");
	   driver.findElement(By.id("billing_phone")).clear();
	   driver.findElement(By.id("billing_phone")).sendKeys("9595362754");
	   
	 /*  List<WebElement> countryList = driver.findElements(By.xpath("//*[@id='s2id_autogen1_search']"));
	   for(WebElement country :countryList)
	   {
		   if(country.getText().equals("India"))
		   {
			   country.click();
			   break;
		   }
		   
		   
	   }*/
	     
	   List<WebElement> countryList = driver.findElements(By.cssSelector("#select2-drop ul li"));
		for(WebElement country : countryList){
			if(country.getText().equals("India")) {
				country.click();	
				
				break;
			}		
		}
	   WebElement street_add = driver.findElement(By.id("billing_address_1"));
	   street_add.clear();
	   street_add.sendKeys("canal road palampur gam");
	   
	   WebElement apprtment = driver.findElement(By.id("billing_address_2"));
	    apprtment.clear();
	    apprtment.sendKeys("Near palampur jakat naka ,Surat");
	   
	    WebElement add_city=driver.findElement(By.id("billing_city"));
	    add_city.clear();
	    add_city.sendKeys("Surat,Gujrat");
	   
   /* WebElement country_town = driver.findElement(By.xpath("//*[@id='select2-chosen-2']"));
  
	   Select select = new Select(country_town);
	   Thread.sleep(2000);
	  select.selectByIndex(5);*/
	    
	  List<WebElement> options = driver.findElements(By.xpath("//*[@id='select2-chosen-2']"));
	 System.out.println( options.size());
	
	  options.get(0).click();
	  
	    	
	    
	 /*   WebElement city = driver.findElement(By.cssSelector("#billing_city"));
	    Thread.sleep(2000);
		city.sendKeys("Gujarat");*/
	
	     WebElement postcode = driver.findElement(By.id("billing_postcode"));
	     postcode.sendKeys("395009");
	 //   WebDriverWait wait2 = new WebDriverWait(driver, 30);
	 //   WebElement diff_add=  wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='checkbox' and@name='ship_to_different_address']")));;
	    
	     
	     Thread.sleep(2000);
	    WebElement shipToDifferetAddress = driver.findElement(By.cssSelector("#ship-to-different-address-checkbox"));
	   
	   shipToDifferetAddress.click();
	    
          
	  //   driver.findElement(By.xpath("//*[@name='ship_to_different_address']")).click();
	     
	     WebElement order_comment = driver.findElement(By.id("order_comments"));
	     order_comment.sendKeys("Testing Purpose");
	     
	    Thread.sleep(3000);

	     WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
	     Actions act2 =new Actions(driver);
	        act2.moveToElement(acceptTC).click().build().perform();
	     
	     //acceptTC.click();
	    
			
			WebElement placeOrder = driver.findElement(By.id("place_order"));
			
		
			placeOrder.submit();
	     
	     String geturl = driver.getCurrentUrl();
	     System.out.println(geturl);
	     
	     if(geturl.equalsIgnoreCase("http://shop.demoqa.com/checkout/order-received/6460/?key=wc_order_5b7d02544f15f"))
	     {
	    	 
	    	 System.out.println("=====Done==============");
	    	 
	     }
	     else
	     {
	    WebElement capture = driver.findElement(By.xpath("//*[text()=' is a required field.']"));
	 String error=   capture.getText();
	 System.out.println("Error message"+error);
	 
	    	 
	     }
			
	}
	

}
