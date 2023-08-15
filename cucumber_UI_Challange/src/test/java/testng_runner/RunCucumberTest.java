package testng_runner;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@FirstPage or @AddUser",
        features = "scr/test/resources/Features",
        glue = {
                "common","step_definitions","testng_runner"
        },
        plugin = {
                "pretty","json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true)
public class RunCucumberTest extends AbstractTestNGCucumberTests{

}
