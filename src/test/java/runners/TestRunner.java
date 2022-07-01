package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                 glue = { "steps" },
                 monochrome = true,
                 plugin = { "pretty",
                		 "html:target/cucumber/cucumber.html",
                		 "json:target/cucumber/cucumber.json"}, tags="@CT01",
                stepNotifications=true)
public class TestRunner {
}
