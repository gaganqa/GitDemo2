package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Appfeatures/uber.feature"},
                 glue= {"stepDefinations"},
                 tags="@Sanity or @Smoke",
                 plugin= {"pretty"})
public class uberTestRunner {

}
