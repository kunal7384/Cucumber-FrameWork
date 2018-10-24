package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"F:\\Selemnium Practice code Aug 2018\\CucumberFrameworkPracticePurpose\\src\\test\\resources\\practicePadFeature\\practice.feature"}
 ,glue="stepDefination")
public class TestRunner {

}
