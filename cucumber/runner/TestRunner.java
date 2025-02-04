package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/main/java/feature/LoginMultiple.feature"}, 
glue = {"steps"}, monochrome = true
//tags = "@functional" //to execute all scenarios having @functional
//tags = "@smoke or @functional" //to execute the scenarios with @smoke or @functional
//tags = "@regression and @functional" //to execute the scenarios with both @regression and @functional
//tags = "not @regression" // to execute all the test scenarios except @regression


//dryRun = true
//snippets = SnippetType.CAMELCASE
)
public class TestRunner extends AbstractTestNGCucumberTests{

}