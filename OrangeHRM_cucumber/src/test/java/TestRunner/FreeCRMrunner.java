package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\main\\resources\\Features\\FreeCRMLogin.feature"},
		glue = "StepDefinations",
		plugin = {"pretty","html:target/cucumbmer-reports/FreeCRM_Report.html"}
		)

public class FreeCRMrunner extends AbstractTestNGCucumberTests{
/*empty class*/
}