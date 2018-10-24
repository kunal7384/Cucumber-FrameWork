package manager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pages.CreateStudent;
import pages.LogOut;
import pages.Login;
import pages.SearchUser;

public class PageObjectManager {
	
	public static   WebDriver driver;
	public static   Login logintests;
	public static   CreateStudent create;
	public static  LogOut logout;
	public static SearchUser search;
	
	
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
		
		
	}
	
	public Login gethomePage() throws IOException 
	{
	 return (logintests==null)?logintests = new Login(driver)	:logintests;
		
		
	}

	
	public  CreateStudent getStudent()
	{
	 return(create==null) ? create = new CreateStudent(driver) : create;
		
		
	}
	public SearchUser getsearchStudent() throws IOException
	{
		
	return(search==null) ? search = new SearchUser(driver)	:search;
		
		
		
	}
	
	public  LogOut getlogout()
	{
		
	return (logout==null)	? logout = new LogOut(driver) : logout;
		
		
	}
	
	
	
	
	
}
