package com.gameaccount.qa.moneygaming.cucumber;

import com.cucumber.listener.Reporter;
import com.gameaccount.qa.moneygaming.basepage.BasePage;
import com.gameaccount.qa.moneygaming.browserselector.BrowserSelector;
import com.gameaccount.qa.moneygaming.loadproperty.LoadProperty;
import com.gameaccount.qa.moneygaming.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Shradha", "Mehta");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver.quit();
        }

    }
}
