package configreader;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import enums.DriverType;
import enums.EnviormentType;


public class ConfigReader {
	
	/*WebDriver driver;
	File file;
	FileInputStream fis;
	Properties pro;
	String path = "F:\\Selemnium Practice code Aug 2018\\CucumberFrameworkPracticePurpose\\conigFile\\test.properties";
	
	
	public ConfigReader () throws IOException
	{
		
	file = new File(path);
	fis = new FileInputStream(file);
	pro = new Properties();
	pro.load(fis);
		
		
	}

	public String getUrl()
	{
	String urlt = pro.getProperty("url");
	if(urlt!=null) 
	return urlt;
	
    else throw new RuntimeException("url not specified in the Configuration.properties file.");	
		
	}
	
	public String getUserforSearch()
	{
		String txtuser = pro.getProperty("search_user.id");
		return txtuser;
		
	}
	
	public DriverType getBrowser()
	{
		
	String browserName = pro.getProperty("browser")	;
	
	if(browserName==null ||browserName.equals("chrome")) return DriverType.CHROME;
	else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
	else if(browserName.equalsIgnoreCase("iexplorer")) return DriverType.INTERNETEXPLORER;
	
	else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	
		
		
	}
	
	
	public EnviormentType getEnvoirment()
	{
		String envior = pro.getProperty("environment");
		
		if(envior==null || envior.equals("local")) return EnviormentType.LOCAL;
		
		else if (envior.equalsIgnoreCase("remote")) return EnviormentType.REMOTE;
		
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + envior);
		
		
		
	}*/
	
    WebDriver driver;
	File file;
	FileInputStream fis;
	Properties pro;
	String path = "F:\\Selemnium Practice code Aug 2018\\CucumberFrameworkPracticePurpose\\conigFile\\test.properties";
	
	public  ConfigReader()
	{
		
	try {
		file = new File(path);
		fis = new FileInputStream(file);
		pro= new Properties();
		pro.load(fis);
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public String getUrl()
	{
		String urlt = pro.getProperty("url");
		if(urlt != null) return urlt;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
		
		
	}
	
		
	
	public DriverType getBrowser() {
		String browserName = pro.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
 
	public EnviormentType getEnvironment() {
		String environmentName = pro.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnviormentType.LOCAL;
		else if(environmentName.equals("remote")) return EnviormentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
 
	public String getUserforSearch()
	{
		String txtuser = pro.getProperty("search_user.id");
		return txtuser;
		
	}
	
}
