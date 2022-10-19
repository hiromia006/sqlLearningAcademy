package com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.tests;

import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.base.ParaBankBaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.OpenAccountPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenAccountTest extends ParaBankBaseTest {
    HomePage homePage;
    OpenAccountPage openAccountPage;

    public OpenAccountTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        browserSetup();
        homePage = new CustomerLoginPage()
                .login(getUsername(), getPassword());
    }

    @Test
    public void openAccountShouldSucceed() {
        openAccountPage = homePage
                .clickOpenAccountLink()
                .selectAccountType("0")
                .selectFromAccount(0)
                .clickOpenAccountBtn();
        Assert.assertTrue(openAccountPage.hasNewAccountId());
    }

    @Test
    public void openAccountWithoutSelectShouldSucceed() {
        openAccountPage = homePage
                .clickOpenAccountLink()
                .clickOpenAccountBtn();
        Assert.assertTrue(openAccountPage.hasNewAccountId());
    }


    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.SUCCESS == result.getStatus()) {
            takeScreenshot(result.getMethod().getMethodName());
        }
        driver.quit();
    }
}
