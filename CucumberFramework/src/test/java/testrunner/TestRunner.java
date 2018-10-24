package testrunner;

import java.io.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dkunal\\git\\cucumber\\CucumberFramework\\src\\test\\resources\\Feature\\login_test.feature"
,glue= {"stepdefination"},plugin = { "com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\dkunal\\Desktop\\Top Coach\\cucumber-reports/report.html"},monochrome=true)
public class TestRunner {
	 
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getextentReport()));
	

	
	
	}
	

}
