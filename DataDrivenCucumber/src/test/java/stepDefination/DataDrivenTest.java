package stepDefination;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataDrivenTest {
	
 static WebDriver driver;
 Scenario scenario;
	public static final String url ="http://practice-pad.com/";
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver = new ChromeDriver();
     

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	   driver.get(url);
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("Enter UserID and PassWord And Login To The Application");
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password(List<UserName> datas) throws Throwable {
		
		System.out.println("1444545455");
		
		System.out.println(" SIZE" + datas.size());
		
		
		
		for(UserName user : datas)
		{
			

			driver.findElement(By.id("username_or_email")).sendKeys(user.getUsername());
			driver.findElement(By.id("login_password")).sendKeys(user.getPassword());
			driver.findElement(By.name("commit")).click();
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
	/*	List<List<String>> tests = data.raw();
		driver.findElement(By.id("username_or_email")).sendKeys(tests.get(0).get(0));
		driver.findElement(By.id("login_password")).sendKeys(tests.get(0).get(1));*/
	   
		
	/*	List<String> test = data.asList(String.class);
		
		driver.findElement(By.id("username_or_email")).sendKeys(test.get(2));
		driver.findElement(By.id("login_password")).sendKeys(test.get(3));
		*/
		
	/*	Map<String, String> test = data.asMap(String.class, String.class);
		driver.findElement(By.id("username_or_email")).sendKeys(test.get("UesrName"));
		driver.findElement(By.id("login_password")).sendKeys(test.get("PassWord"));*/
		
		
		
		/*for (Map<String, String> test : data.asMaps(String.class, String.class))
		{
		driver.findElement(By.id("username_or_email")).sendKeys(test.get("UesrName"));
		driver.findElement(By.id("login_password")).sendKeys(test.get("PassWord")); 
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//*[@class='user-avtar']")).click();
		
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		}
		
		/*Map<String, String> test = data.asMap(String.class, String.class);
				
		driver.findElement(By.id("username_or_email")).sendKeys(test.get("UesrName"));	
		
		driver.findElement(By.id("login_password")).sendKeys(test.get("PassWord")); 
		driver.findElement(By.name("commit")).click();
		
	}

/*	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully(DataTable datas) throws Throwable {
	    driver.findElement(By.xpath("//*[text()='New Student']")).click();
	    
	    List<Map<String, String>> tests = datas.asMaps(String.class, String.class);
	    
	    driver.findElement(By.id("user_fname")).sendKeys(tests.get(0).get("Name"));
	    
	    
	    driver.findElement(By.id("user_lname")).sendKeys(tests.get(0).get("LastName"));
	    
	    
	    driver.findElement(By.id("user_email")).sendKeys(tests.get(0).get("Email"));
	    
	    
	    
	    driver.findElement(By.id("user_password")).sendKeys(tests.get(0).get("Passwordd"));
	    
	    
	    
	    driver.findElement(By.id("user_password_confirmation")).sendKeys(tests.get(0).get("Cpassword"));
	    driver.findElement(By.xpath("//*[text()='×']")).click();
	   System.out.println(tests.size());
	   
	   for(int i =0;i<tests.size();i++)
	   {
		   System.out.println(tests.get(i).get("Name"));
		   System.out.println(tests.get(i).get("LastName"));
		   System.out.println(tests.get(i).get("Email"));
		   System.out.println(tests.get(i).get("Passwordd"));
		   System.out.println(tests.get(i).get("Passwordd"));
		   
		   
		   
	   } */
	
	// passing Multiple student data
	
/*	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully(DataTable datas) throws Throwable {
	  
	    
	    for(Map<String, String> tests : datas.asMaps(String.class, String.class))
	    		{
	    	
	    	System.out.println("11");
	     driver.findElement(By.xpath("//*[text()='New Student']")).click();
	     
	    driver.findElement(By.id("user_fname")).sendKeys(tests.get("Name"));
	    
	    
	    driver.findElement(By.id("user_lname")).sendKeys(tests.get("LastName"));
	    driver.findElement(By.id("user_username")).sendKeys(tests.get("userNAme"));
	    
	    
	    driver.findElement(By.id("user_email")).sendKeys(tests.get("Email"));
	    
	    
	    
	    driver.findElement(By.id("user_password")).sendKeys(tests.get("Passwordd"));
	    
	    
	    
	    driver.findElement(By.id("user_password_confirmation")).sendKeys(tests.get("Cpassword"));
	    
	    
	    
	    driver.findElement(By.xpath("//*[text()='×']")).click();
	    
          
	   System.out.println(tests.size());
	   Thread.sleep(1500);
	   
	   
	    }*/
	  
	
	


}
