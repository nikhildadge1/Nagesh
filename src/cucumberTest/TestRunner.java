package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature",
		glue= {"stepDefination"},
		plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true
		)

public class TestRunner {

}
