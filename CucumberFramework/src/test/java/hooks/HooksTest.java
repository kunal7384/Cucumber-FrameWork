package hooks;

import cucumber.TestContext;
import cucumber.api.java.After;
import managers.WebDriverManager;

public class HooksTest {
	
	TestContext testContext;
	
	
	public HooksTest(TestContext context)
	{
		
	testContext = context;	
		
	}
	
	@After
	
	public void AfterSteps()
	{
		
	testContext.getWebDriverManager().closeDriver();
		
		
	}

}
