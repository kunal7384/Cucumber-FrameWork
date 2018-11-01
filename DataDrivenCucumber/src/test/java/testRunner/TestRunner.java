package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"F:\\Selemnium Practice code Aug 2018\\DataDrivenCucumber\\src\\test\\resources\\feature\\practiceTest.feature"},
glue="stepDefination")
public class TestRunner {

}
