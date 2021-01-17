package com.tutorialsninja.automation.config;


import java.io.IOException;
import java.util.Properties;

import com.tutorialsninja.automation.util.PathHelper;


public class PropertyFileReader implements ConfigurationReader {

     Properties properties = null;

    public PropertyFileReader() {
        properties = new Properties();
        try {
            properties.load(PathHelper.getInputStreamResourcePath("/src/main/resources/ConfigurationFile/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getChromedriverLocation() {
        return properties.getProperty("browserLocation");
    }

    public int getPageLoadTimeOut() {
        return Integer.parseInt(properties.getProperty("PageLoadTimeOut"));
    }


    public String getReportConfigPath(){
        String reportConfigPath = properties.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }


}
