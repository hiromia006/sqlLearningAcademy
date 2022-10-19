package com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.tests;

import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.base.ParaBankBaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.TransferFundsPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransferFundsTest extends ParaBankBaseTest {
    HomePage homePage;
    TransferFundsPage transferFundsPage;

    public TransferFundsTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        browserSetup();
        homePage = new CustomerLoginPage()
                .login(getUsername(), getPassword());
    }

    @Test
    public void transferFundShouldSucceed() {
        transferFundsPage = homePage
                .clickTransferLink()
                .fillAmount(500)
                .clickTransferBtn();
        Assert.assertTrue(transferFundsPage.hasTransferAmount());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.SUCCESS == result.getStatus()) {
            takeScreenshot(result.getMethod().getMethodName());
        }
        driver.quit();
    }
}
