package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  features = "src/test/resources/Addcustomer.feature",
        glue = "Stepdefination",
        dryRun=false,
        plugin = {"pretty" , "html:target/html_report.html"}
)

public class RunAddcustomerfeature {
    //this class is empty
}
