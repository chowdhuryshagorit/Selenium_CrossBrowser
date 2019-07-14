package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="features",
		glue="steps",
		tags="@tag"
		
		
		
		)

public class Testrunner extends AbstractTestNGCucumberTests {

}
