package com.tutorialsninja.automation.base;

import com.tutorialsninja.automation.config.ConfigurationReader;
import com.tutorialsninja.automation.config.PropertyFileReader;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.util.PathHelper;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class Base {

    public static Logger log = Logger.getLogger(Base.class);

    public static WebDriver driver;
    public static ConfigurationReader reader;


    @Before
    public void setUp(Scenario scenario) {
        log.info("Scenario Started: " + scenario.getName());
        PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
        reader = new PropertyFileReader();
        reader.getReportConfigPath();
        //Browser.startBrowser("chrome");
       // Browser.maximize();
    }



    @After
    public void closeBrowser(Scenario scenario) throws IOException, InterruptedException {
        if (scenario.isFailed()) {
            scenario.embed(Browser.takeScreenshot(), "image/png" + getCurentTime());
        }
        log.info("Scenario Completed: " + scenario.getName());
        log.info("Scenario Status is: " + scenario.getStatus() + "and time is " + getCurentTime());
        Base.driver.quit();


    }

    public String getCurentTime() throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);

    }


}

