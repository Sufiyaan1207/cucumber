package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = { "src\\main\\resources\\Features\\search.feature" }, // to execute single file
		// features = {"src\\main\\resources\\Features"}, //to execute all feature file
		glue = "StepDefinations", tags = "@Regression", // execute only scenario under spcefic tag
		plugin = { "pretty", "html:target/cucumbmer-reports/Search_Report.html" }
		)

public class SearchRun extends AbstractTestNGCucumberTests {

}
