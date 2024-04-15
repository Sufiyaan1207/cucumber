package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

	//	features = { "src\\main\\resources\\Features\\nopLogin.feature" }, glue = "StepDefinations",
				features = { "src\\main\\resources\\Features\\nopCustomer.feature" }, glue = "StepDefinations",
		plugin = {"pretty", "html:target/cucumbmer-reports/nopAddCustomer_Report.html" },
		//plugin = {"pretty", "json:target/cucumbmer-reports/nopLogin_Report.json" },
		monochrome = false, dryRun = false)

public class nopRunner extends AbstractTestNGCucumberTests {
	/* empty */
}
