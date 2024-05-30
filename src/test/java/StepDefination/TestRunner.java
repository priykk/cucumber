package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Features/",glue= {"StepDefination"},
plugin={"pretty","html:/target/Html_Report"},
monochrome=true

//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		//"junit:target/cucumber-reports/Cucumber.xml",
		//"html:target/cucumber-reports"},

//\CucumberJavaProject\target\Html_Report
)
public class TestRunner {
	

}
