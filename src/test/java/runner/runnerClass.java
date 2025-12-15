package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFile/makeMyTrip.feature",glue = "stepDefinition",
        publish = true,plugin = {"html:target/Reports/report.html","json:target/Reports/report.json"})
public class runnerClass {
}
