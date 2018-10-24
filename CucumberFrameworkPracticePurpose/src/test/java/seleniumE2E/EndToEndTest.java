package seleniumE2E;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndToEndTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://practice-pad.com");
		driver.findElement(By.id("username_or_email")).sendKeys("bhavesh");
		driver.findElement(By.id("login_password")).sendKeys("password");
		driver.findElement(By.name("commit")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement stu= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Layer_1']")));
		stu.click();
		
		driver.findElement(By.id("user_fname")).sendKeys("abcdef");
		driver.findElement(By.id("user_lname")).sendKeys("dddd");
		driver.findElement(By.id("user_username")).sendKeys("eeeee");
		driver.findElement(By.id("user_email")).sendKeys("dd@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.id("user_password_confirmation")).sendKeys("password");
		driver.findElement(By.id("user_favorites")).sendKeys("This is for Testing purpose");
		
		driver.findElement(By.xpath("//*[text()='×']")).click();
		
		driver.findElement(By.xpath("//*[@id='search_user']")).sendKeys("Kunal Dhote");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[text()='Select Student']")).click();
		WebElement txt = driver.findElement(By.xpath("//*[@class='ass-inner demo-gallery']"));
		String txtdemo = txt.getText();
		System.out.println(txtdemo);
		
		  WebElement  allTeachers;
		 WebDriverWait waitfor = new WebDriverWait(driver, 60);
		    allTeachers = waitfor.until(ExpectedConditions.visibilityOfElementLocated(By.id("teachers")));
		    boolean display = allTeachers.isDisplayed();
		    System.out.println(display);
		    Select sel = new Select(allTeachers);
		    sel.selectByVisibleText("Ankur narola");
		   // sel.selectByIndex(5);
		    allTeachers.click();
		  
		     
		  
			
			
			Select select = new Select(allTeachers);
		select .selectByVisibleText("Ankur narola");
		allTeachers.click();
		String all =allTeachers.getText();
		System.out.println("All Teachers Name IS " + " ::   "  + all);
		
		WebElement log= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='user-avtar']")));
		log.click();
		
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
		
		driver.close();
	}
	
	

}
