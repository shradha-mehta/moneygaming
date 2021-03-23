package com.gameaccount.qa.moneygaming.pages;

import com.cucumber.listener.Reporter;
import com.gameaccount.qa.moneygaming.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    @FindBy (xpath = "//a[contains(text(),'Join Now!')]")
    WebElement _joinNow;

    @FindBy(xpath = "//option[contains(text(),'Ms')]")
    WebElement _title;

    @FindBy (xpath = "//input[@id='forename']")
    WebElement _firstName;

    @FindBy (xpath = "//body/div[2]/div[3]/form[1]/fieldset[1]/input[2]")
    WebElement _surName;

    @FindBy (xpath = "//body/div[2]/div[3]/form[1]/fieldset[5]/input[3]")
    WebElement _termsAndCondition;

    @FindBy (xpath = "//input[@id='form']")
    WebElement _joinNowForm;

    @FindBy (xpath = "//body/div[2]/div[3]/form[1]/fieldset[1]/label[5]")
    WebElement _errorMsg;

    public void clickOnJoinNowButton() {
        Reporter.addStepLog("Clicking On Join now Button " + _joinNow.toString());
        clickOnElement(_joinNow);
        log.info("Clicking On Join now Button " + _joinNow.toString());
    }

    public void clickOnTitle(){
        Reporter.addStepLog("Selecting Title " + _title.toString());
        clickOnElement(_title);
        log.info("Selecting Title " + _title.toString());


    }
    public void enterFirstName(String firstName) {
        Reporter.addStepLog("Enter First Name " + firstName + "First Name Field " + _firstName.toString() + "<br>");
        sendTextToElement(_firstName, firstName);
        log.info("Enter First Name " + firstName + "First Name Field " + _firstName.toString());
    }
    public void enterSurName(String surName) {
        Reporter.addStepLog("Enter Sur Name " + surName + "Sur Name Field " + _surName.toString());
        sendTextToElement(_surName, surName);
        log.info("Enter Sur Name " + surName + "Sur Name Field " + _surName.toString());
    }
    public void selectCheckBoxOfTermsAndCondition() {
        Reporter.addStepLog("Clicking on check box button for T&C " + _termsAndCondition.toString());
        clickOnElement(_termsAndCondition);
        log.info("Clicking on check box button for T&C");
    }
    public void clickOnJoinNowFormButton() {
        Reporter.addStepLog("Clicking On Join now form Button " + _joinNowForm.toString());
        clickOnElement(_joinNowForm);
        log.info("Clicking On Join now form Button" + _joinNowForm.toString());
    }
    public String getErrorMsg(){
        Reporter.addStepLog("Getting Error Message " + _errorMsg.toString());
        log.info("Getting Error Message " + _errorMsg.toString());
        return getTextFromElement(_errorMsg);
    }



}
