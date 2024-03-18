package amazonRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features/amazon.feature"},
glue= {"amazonSteps","myHooks"},
plugin= {"pretty"},
stepNotifications= true,
//"html: target/CucumberReports/CucumberReport1","json:target/JSONReports/report.json", "junit: target/junit_xml/cucumber.xml"
//tags="@login",
dryRun = false
)

public class amazonRunner1 {

}
