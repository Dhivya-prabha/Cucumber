package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/java/feature/login.feature", glue = "steps", monochrome = true )
public class TestRunner extends AbstractTestNGCucumberTests{

	
	
	
}
