package runnner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/Feature"
,glue= {"src/test/java/Stepdeff"}
,plugin = { "pretty", "html:target/cucumber-reports.html","json:target/cucumber.json" },
monochrome = true
)

public class run {

}