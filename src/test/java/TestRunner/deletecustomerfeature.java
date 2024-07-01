package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/DeleteCustomer.feature",
        glue = "Stepdefination",
        dryRun = false,

        plugin = {"pretty","html:target/html_report.html"}
)


public class deletecustomerfeature {
}
