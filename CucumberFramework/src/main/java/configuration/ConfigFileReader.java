package configuration;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	public static WebDriver driver;
	File file;
	FileInputStream fis;
	Properties pro;
	
	public  ConfigFileReader()
	{
		
	try {
		file = new File("C:\\Users\\dkunal\\git\\cucumber\\CucumberFramework\\config\\congiguration.properties");
		fis = new FileInputStream(file);
		pro= new Properties();
		pro.load(fis);
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	public String getApllicationUrl()
	{
		String urlt = pro.getProperty("url");
		if(urlt != null) return urlt;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
		
		
	}
	public String getextentReport()
	{
		String extentReportPath =pro.getProperty("reportConfigPath");
		
		if(extentReportPath !=null) return extentReportPath;
		else throw new RuntimeException("url not specified in the Configuration.properties file."); 
		
	}
	public DriverType getBrowser() {
		String browserName = pro.getProperty("browser");
		if(browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
 
	public EnvironmentType getEnvironment() {
		String environmentName = pro.getProperty("environment");
		if(environmentName == null || environmentName.equalsIgnoreCase("local")) return EnvironmentType.LOCAL;
		else if(environmentName.equals("remote")) return EnvironmentType.REMOTE;
		else throw new RuntimeException("Environment Type Key value in Configuration.properties is not matched : " + environmentName);
	}
 
	public Boolean getBrowserWindowSize() {
		String windowSize = pro.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
	
		
}
