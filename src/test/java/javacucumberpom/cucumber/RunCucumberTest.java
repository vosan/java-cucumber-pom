package javacucumberpom.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
features = "src/test/resources/javacucumberpom/features",
glue = {"javacucumberpom.cucumber", "javacucumberpom.stepDefinitions"})

public class RunCucumberTest {
}
