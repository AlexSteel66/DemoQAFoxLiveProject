package com.tutorialsninja.automation.config;

public interface ConfigurationReader {
	
	public String getUrl();
	public String getBrowser();
	public String getChromedriverLocation();
	public int getPageLoadTimeOut();
	public String getReportConfigPath();


}
