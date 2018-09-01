package checkoutpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	public  static WebDriver driver;
	

	@FindBy(id="billing_first_name")
	public static WebElement fname;
	
	
	@FindBy(id="billing_last_name")
	public static 	WebElement lname;
	
	
	@FindBy(id="billing_company")
	public static 	WebElement companyname;
	
	
	@FindBy(id="billing_email")
	public static 	WebElement email;
	
	
	@FindBy(id="billing_phone")
	public static 	WebElement phone;
	
	@FindBy(xpath="//*[@id='s2id_autogen1_search']")
	public static WebElement country_set;
	
	
	@FindBy(id="billing_address_1")
	public static WebElement addline_1;
	
	@FindBy(id="billing_address_2")
	public static WebElement addline_2;
	
	@FindBy(id="billing_city")
	public static WebElement cityy;
	

	@FindBy(xpath="//*[@id='select2-chosen-2']")
	public static List<WebElement> select_state;
	
	@FindBy(id="billing_postcode")
	public static WebElement postcode;
	
	@FindBy(xpath="//*[@id='ship-to-different-address-checkbox']")
	public static WebElement click_diffrent_shipiing_add;
	
	@FindBy(xpath="//*[@type='checkbox' and @id='terms']") 
	public static  WebElement terms;
	
	
	
	@FindBy(xpath="//*[@id='place_order']")
	public static WebElement place_or;
	
	
	
	public CheckOut(WebDriver driver)
	{
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}

	
	public void enter_firstName(String fName)
	{
		fname.sendKeys(fName);
		
		
	}
	
	public void enter_lastName(String lName)
	{
		lname.sendKeys(lName);
		
		
	}
	
	public void enter_companytName(String comp)
	{
		companyname.sendKeys(comp);
		
		
	}
	
	public void enter_email(String mail)
	{
		email.sendKeys(mail);
		
		
	}
	
	
	public void enter_phone(String number)
	{
		phone.sendKeys(number);
		
		
	}
	
	public void enter_addline1(String add)
	{
		addline_1.sendKeys(add);
		
		
	}
	
	public void enter_addline2(String add1)
	{
		addline_2.sendKeys(add1);
		
		
	}
	public void enter_city(String city)
	{
		cityy.sendKeys(city);
		
		
	}
	public void select_County(String countyName) {
		country_set.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
 
		for(WebElement county : select_state){
			if(county.getText().equals(countyName)) {
				county.click();	
				try { Thread.sleep(3000);}
				catch (InterruptedException e) {}
				break;
			}
		}
	}
	    
	
	public void enter_postcode(String post)
	{
		postcode.sendKeys(post);
		
	}
	
 
	public void fill_personDetail()
	{
		
		enter_firstName("Kunal");
		enter_lastName("Dhote");
		enter_companytName("Capgeminy");
		enter_email("abcd@gmail.com");
		enter_phone("1234567890");
		enter_addline1("Palampur JakatNaka");
		enter_addline2("Canal Road ,Surat");
		enter_city("Surat");
		//select_County("Gujarat");
		enter_postcode("123456");
	}
	
	 public void click_diff_add()
	  {
		click_diffrent_shipiing_add.click();  
		  
		  
	  }
	
	public void click_terms() throws InterruptedException
	{
		
		Thread.sleep(2000);
		terms.click();
		
		
	}
	
	
	
	public void placeorder() {
		
		place_or.submit();
		
	}
	
	public void error()
	{
		
		
		  String exceptedurl ="http://shop.demoqa.com/checkout/order-received/6527/?key=wc_order_5b7e58780bead";
		 String actualurl = driver.getCurrentUrl();
		 System.out.println(actualurl);
		 if(actualurl.equalsIgnoreCase(exceptedurl))
		 {
			 
			 System.out.println("Suceesfully filled all the information");
			 
		 }
		 
		 else
		 {
			WebElement error = driver.findElement(By.xpath("//*[text()=' is a required field.']")) ;
			System.out.println(error.getText());
			 
			 
		 }
		
		
	}
	
}
