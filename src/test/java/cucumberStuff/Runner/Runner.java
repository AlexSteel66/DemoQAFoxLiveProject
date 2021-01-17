package cucumberStuff.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/features", tags = "@Login2",
        glue = {"cucumberStuff/StepDefinitions"},
        plugin = {
                "pretty",
                "html:C:/Users/Uzivatel/Desktop/myLove/cucumber-reports",
                "junit:C:/Users/Uzivatel/Desktop/myLove/Cucumber.xml"},
        monochrome = true
        //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:C:/Users/Uzivatel/Desktop/myLove/report.html"}
)

public class Runner {

}