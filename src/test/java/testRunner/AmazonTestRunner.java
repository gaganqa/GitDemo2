package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Appfeatures/Search.feature" }, 
glue = {"stepDefinations","MyHooks"},
plugin= {"pretty",
		"json:target/MyReports/report.json",
		"junit:target/MyReports/report.xml"
        },
publish=true 
		)


public class AmazonTestRunner {

}
