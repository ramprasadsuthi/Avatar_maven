package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "Features//calc.feature"
		,glue={"stepDefinition"} 
		,tags= {~@P1}
		,plugin = { "pretty", "junit:target/Cucumber.xml",
                             "html:target/cucumber-reports.html"},
		publish = true,
		monochrome = true)

public class TestRunner {
	
}


