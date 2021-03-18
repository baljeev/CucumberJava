package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Uber.feature",
glue="StepDefinitions",
//tags ="@All",
monochrome=true,

		plugin={"pretty",
		"html:target/Myreports/test-output",
		"json:target/Myreports/report.json",
		"junit:taget/Myreports/report.xml"},
		dryRun =false

		
		)
public class UberTest {

}
