package com.buyagift.cucumber.stepdefs;

import com.buyagift.pages.HolidayPage;
import com.buyagift.utility.Utility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HolidayTest extends Utility {



    @Given("^I am on buyagift homepage$")
    public void iAmOnBuyagiftHomepage() {
    }

    @And("^I click on short break button$")
    public void iClickOnShortBreakButton() {
        new HolidayPage().clickOnShortBreaks();
    }

    @And("^I click on one night break button$")
    public void iClickOnOneNightBreakButton() {
        new HolidayPage().clickOnOneNightBreak();
    }

    @Then("^I should be able to see one night break holiday list on page$")
    public void iShouldBeAbleToSeeOneNightBreakHolidayListOnPage() {

    }
}

