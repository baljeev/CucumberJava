package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue="StepDefinitions",
monochrome=true,
dryRun=false,

		plugin={"pretty","html:test-output","json:json_output","junit:junit_xml_output/cucum.xml"}
		
		
		)
public class RunnerTest {

}
