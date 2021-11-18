package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/Appfeatures/ordermanagement.feature" }, 
glue = { "stepDefinations" },
plugin = { "pretty" })
public class OrderMangRunner {
	
}
