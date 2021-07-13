package com.buyagift.pages;

import com.cucumber.listener.Reporter;
import com.buyagift.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HolidayPage extends Utility {
    private static final Logger log = LogManager.getLogger(HolidayPage.class.getName());

    @FindBy (linkText = "Short Breaks")
    WebElement _shortBreaks;

    @FindBy(xpath = "//div[contains(text(),'One Night Breaks')]")
    WebElement _oneNightBreak;



    public void clickOnShortBreaks() {
        Reporter.addStepLog("Clicking On Short Break Button " + _shortBreaks.toString());
        clickOnElement(_shortBreaks);
       // log.info("Clicking On Short Break Button " + _shortBreaks.toString());
    }

    public void clickOnOneNightBreak(){
        Reporter.addStepLog("Clicking on One Night Break" + _oneNightBreak.toString());
        clickOnElement(_oneNightBreak);
        log.info("Clicking on One Night Break" + _oneNightBreak.toString());


    }



}
