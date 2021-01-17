package cucumberStuff.StepDefinitions;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.MainSiteSection;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    @Given("I launch the application with {string}")

    public static void i_launch_the_application(String browser) {

        Browser.startBrowser(browser);
        Browser.maximize();
        Base.driver.get("http://www.tutorialsninja.com/demo/");
    }

    @io.cucumber.java.en.When("^I navigate to Account Registration page$")
    public void i_navigate_to_Account_Registration_page() throws Throwable {
        MainSiteSection mainSiteSection = new MainSiteSection();
        Elements.click(MainSiteSection.myAccount);
        Elements.click((MainSiteSection.register));


    }

    @When("^I provide all the below valid details$")
    public void i_provide_all_the_below_valid_details(DataTable arg1) throws Throwable {


    }

    @When("^I select the Privacy Policy$")
    public void i_select_the_Privacy_Policy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I click on Continue button$")
    public void i_click_on_Continue_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I should see that the User Account has successfully created$")
    public void i_should_see_that_the_User_Account_has_successfully_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


    }


}
