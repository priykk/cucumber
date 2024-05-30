package StepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class TestRunnerForBackgroundDemo {

    @RunWith(Cucumber.class)
    @CucumberOptions(features="./src/test/resources/BackgroundDemo/BackgroundDemo.feature",glue= {"BackgroundDemoSteps"},



            monochrome=true;

            plugin = { "pretty", "junit:target/JunitReports/report.xml"
                    "junit:target/JSONReports/report.json",
                    "html:target/HtmlReportss"}
    )
}


