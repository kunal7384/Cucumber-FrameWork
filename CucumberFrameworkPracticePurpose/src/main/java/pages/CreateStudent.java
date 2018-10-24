package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateStudent {

	String excepted="Password confirmation doesn't match Password";
	@FindBy(xpath= "//*[@id='Layer_1']")
	WebElement stuclick;
	
	
	@FindBy(id= "user_fname")
	WebElement fname;
	
	
	@FindBy(id= "user_lname")
	WebElement lname;
	
	
	@FindBy(id= "user_username")
	WebElement userName;
	
	
	@FindBy(id= "user_email")
	WebElement mail;
	
	
	@FindBy(id="user_password")
	WebElement userpassword;
	
	
	@FindBy(id="user_password_confirmation")
	WebElement confirmpassword;
	
	@FindBy(id="user_favorites")
	WebElement fav;
	

	
	@FindBy(xpath="//*[@name='commit']")
	WebElement submmit;
     
	@FindBy(xpath="//span[contains(text(),\"Password confirmation doesn't match Password\")]")
	WebElement error_message;
	
	@FindBy(xpath="//*[text()='×']")
	WebElement close;

	public CreateStudent(WebDriver driver)
	{
PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	public void click_stu()
	{
		System.out.println("=========Student Click =====");
	stuclick.click();	
		
	}
	
	public void enter_fName(String FirstName)
	{
		fname.sendKeys(FirstName);
		
	}
	
	
	public void enter_lName(String lastName)
	{
	lname.sendKeys(lastName);
		
	}
	
	public void enter_uName(String user_name)
	{
		userName .sendKeys(user_name);
		
	}
	  
	
	public void enter_email(String emailadd)
	{
		mail.sendKeys(emailadd);
		
	}
	
	
	public void enter_upassWord(String upassword)
	{
		userpassword.sendKeys(upassword);
	}
	
	public void enter_confirmpassword(String ucpassword)
	{
		
		confirmpassword.sendKeys(ucpassword);
	}
	
	
	public void favorite(String ufav)
	{
		fav.sendKeys(ufav);
		
	}
	
	public void submit_stu()
	{
		
	submmit.click();	
		
	}
	
	
	public void closeForm()
	{
		close.click();
		
	}
	
	public void error()
	{
		
		String txterror=error_message.getText(); 
		System.out.println(txterror);
		if (txterror.equalsIgnoreCase(excepted))
				{
			
			System.out.println("Student not created  ");
			
				}
		
		
		else
		{
			System.out.println("Student Created");
			
		}
		close.click();
	}
	
	
	
	public void fillstudent_Info()
	{
		System.out.println("Fill INfo");
		enter_fName("abcde");
		enter_lName("gggg");
		enter_uName("aaaaa");
		enter_email("aa@gmail.com");
		enter_upassWord("password");
		//enter_confirmpassword("password");
		favorite("dfdsfdsff");
	
	
	}
}
