package pages;

import java.io.IOException;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import configreader.ConfigReader;
import manager.FileReaderManager;

public class SearchUser {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='search_user']")
	WebElement search_user;
	
	@FindBy(xpath="//*[text()='Select Student']")
	
	WebElement select_student;
	
	@FindBy(xpath="//*[@class='ass-inner demo-gallery']")
	WebElement assignment;
	
	@FindBy(xpath="//*[@title='All']")
	WebElement allTeachers;
	
	public SearchUser(WebDriver driver) throws IOException
	{
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		ConfigReader cf= new ConfigReader();
		
	}
	
	public void search_Student() throws IOException, InterruptedException
	{
	  search_user.sendKeys(FileReaderManager.getInstance().getConfigReader().getUserforSearch());
	  Thread.sleep(2000);
	select_student.click();
String txtass=	assignment.getText();
System.out.println(txtass);
  
  
	}
	
	public void get_All_Teachers() throws InterruptedException
	{
	    WebDriverWait waitfor = new WebDriverWait(driver, 30);
	    allTeachers = waitfor.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//*[@title='All']")));
	    boolean display = allTeachers.isDisplayed();
	    System.out.println(display);
	  
		
		
		Select select = new Select(allTeachers);
	select .selectByVisibleText("Ankur narola");
	allTeachers.click();
	String all =allTeachers.getText();
	System.out.println("All Teachers Name IS " + " ::   "  + all);
		
		
	}

}
