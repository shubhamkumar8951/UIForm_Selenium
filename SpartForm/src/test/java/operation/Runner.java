package operation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature"},
		glue= {"operation"},
		plugin= {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/report1.html"
				} ,
		
		monochrome= true,
		dryRun= false

		)
public class Runner {

}
