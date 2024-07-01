package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//instead of main method used
@CucumberOptions
        (  features = "src/test/resources/Register.feature",
                glue = "Stepdefination",
                dryRun=false,
                plugin = {"pretty" , "html:target/html_report.html"}
        )
public class RunRegisterfeature
{


}
