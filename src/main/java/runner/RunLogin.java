package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = "src/test/java/features/CreateLead.feature",//if we mention package name in the path all the feature files in package gets executed

                 glue = "steps", 
                 monochrome = true,
                 tags = {"@FunctionalTest"}) //will execute scenarios with functional tag
                 //tags = {"@FunctionalTest,@RegressionTest"}) //either one of the tag is there then that test case will execute
//tags = {"@FunctionalTest","@RegressionTest"}) //scenario with both the tag gets executed
//tags = {"~@FunctionalTest"}) //except functional all other scenario gets executed


//dryRun = true,
//snippets = SnippetType.CAMELCASE)
public class RunLogin extends AbstractTestNGCucumberTests{

}
