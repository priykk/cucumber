

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/HooksDemo/HooksDemo.feature",glue= {"StepsForHooks"},



monochrome=true;

plugin = { "pretty", "junit:target/JunitReports/report.xml"
		"junit:target/JSONReports/report.json",
		"html:target/HtmlReportss"}
)
class TestRunnerForHooks {
	

}
