package cucumberStuff.StepDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.util.PathHelper;
import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Hooks {

    private static Logger log = Logger.getLogger(Hooks.class);

    @Before
    public void setUp(Scenario scenario) throws Throwable {
        PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
        log.info("Scenario Started: " + scenario.getName());
        Base.reader = new PropertyFileReader();

       // Base.driver.get("https://stackoverflow.com/questions/43067617/cucumber-java-how-to-use-returned-string-from-a-step-in-next-step");

    }

    /*    String randomBrowser = getRandomBrowser();
       Browser.startBrowser(randomBrowser);
       Browser.maximize();*/







       //Base.driver.get("https://www.softpost.org/cucumber/passing-parameters-to-cucumber-steps/");



    @After
    public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(Browser.takeScreenshot(), "image/png");
        }
        log.info("Scenario Completed: " + scenario.getName());
        log.info("Scenario Status is: " + scenario.getStatus());
        Base.driver.quit();
    }

    public static String getRandomBrowser(){
        String[] list = {"mozilla", "mozilla", "mozilla", "chrome", "chrome"};
        Random r = new Random();
        return list[r.nextInt(list.length)];
    }
}




