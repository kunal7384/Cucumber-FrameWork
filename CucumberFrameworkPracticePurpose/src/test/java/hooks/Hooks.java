package hooks;

import cucumber.TestContext;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
		 
		TestContext testContext;
	 
		public Hooks(TestContext context) {
			testContext = context;
		}
	 
		@Before
		public void BeforeSteps() {
			System.out.println("=================Start Test Execution =========");
		}
	 
		@After
		public void AfterSteps() {
			testContext.getWebDriverManager().closeDriver();
			
			//System.out.println(" After Test Hooks Testing Purpose Herer take");
		}
	 
	}


