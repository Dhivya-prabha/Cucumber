package runner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features= {"src/test/java/feature"}, glue = {"steps"}, monochrome = true, tags = {"@Reg, @Sanity"}, 
		plugin= {"pretty", "html:cucumber-reports"})
public class RunSteps extends AbstractTestNGCucumberTests {
 
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}