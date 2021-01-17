package com.tutorialsninja.automation.pages;

import com.tutorialsninja.automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainSiteSection {

    //public WebDriver driver = null;

    public MainSiteSection() {
        //this.driver = driver;
        PageFactory.initElements(Base.driver, this);

    }

    @FindBy(className = "zh-customers")
    public static WebElement Customers;

    @FindBy(className = "zh-support")
    public WebElement Support;

    @FindBy(xpath = "//a[contains(@class,'zh-login')]")
    public static WebElement Login;

    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    public static WebElement myAccount;

    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    public static WebElement register;
}

