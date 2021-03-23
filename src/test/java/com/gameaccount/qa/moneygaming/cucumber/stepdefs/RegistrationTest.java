package com.gameaccount.qa.moneygaming.cucumber.stepdefs;

import com.gameaccount.qa.moneygaming.pages.RegistrationPage;
import com.gameaccount.qa.moneygaming.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegistrationTest extends Utility {
    @Given("^I am on money gaming homepage$")
    public void iAmOnMoneyGamingHomepage() {
    }

    @And("^I click on join now button$")
    public void iClickOnJoinNowButton() {
        new RegistrationPage().clickOnJoinNowButton();
    }

    @And("^I select title$")
    public void iSelectTitle() {
        new RegistrationPage().clickOnTitle();
    }

    @When("^I enter my first name \"([^\"]*)\"$")
    public void iEnterMyFirstName(String firstName)  {
        new  RegistrationPage().enterFirstName(firstName);

    }

    @And("^I enter sur name \"([^\"]*)\"$")
    public void iEnterSurName(String surName)  {
        new RegistrationPage().enterSurName(surName);

    }

    @And("^I click on check box of terms and condition$")
    public void iClickOnCheckBoxOfTermsAndCondition() {
        new RegistrationPage().selectCheckBoxOfTermsAndCondition();
    }

    @And("^I click on join now form button$")
    public void iClickOnJoinNowFormButton() {
        new RegistrationPage().clickOnJoinNowFormButton();
    }

    @Then("^I should not register successfully and see \"([^\"]*)\"$")
    public void iShouldNotRegisterSuccessfullyAndSee(String errorMessage)  {
        Assert.assertEquals(new RegistrationPage().getErrorMsg(),"This field is required");

    }
}
