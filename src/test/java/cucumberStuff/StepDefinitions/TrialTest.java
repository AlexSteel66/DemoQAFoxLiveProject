package cucumberStuff.StepDefinitions;


import com.tutorialsninja.automation.base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.io.IOException;

public class TrialTest {

    public TrialTest() throws IOException, InterruptedException {

    }

    @io.cucumber.java.en.Given("I launch the application with with {string}")
    public void iLaunchTheApplicationWithWith(String browser) {
        StepDefinitions.i_launch_the_application(browser);

        //Base.driver.get(Base.reader.getUrl());

    }

    @Given("I navigate to Account Registration page for a freedom")
    public void i_navigate_to_Account_Registration_page_for_a_freedom() throws IOException {


    }

    @When("I provide all the below valid details neetly")
    public void i_provide_all_the_below_valid_details_neetly(io.cucumber.datatable.DataTable dataTable) throws IOException, InterruptedException {


    }


}
