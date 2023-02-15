package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.testcases;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.OpenAccountPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.OverviewPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenAccountSeleniumBatch4Test extends BaseSeleniumBatch4Test {
    CustomerLoginPage loginPage;
    OverviewPage overviewPage;
    OpenAccountPage openAccountPage;

    public OpenAccountSeleniumBatch4Test() {
        super();

    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
        overviewPage = new CustomerLoginPage()
                .login(getUserName(), getPassword());
    }

    @Test
    public void openAccountShouldSucceed() {
        openAccountPage = overviewPage
                .clickOpenAccountLink()
                .clickOpenAccountBtn();
        Assert.assertTrue(openAccountPage.hasNewAccountId());
        openAccountPage.clickLogOutBtn();
    }


    @AfterClass
    public void tearDown() {
        GeneralSeleniumBatchFour.domStable();
        driver.quit();
    }
}
