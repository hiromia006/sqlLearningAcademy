package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.test;


import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.LoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.RequestLoanPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RequestLoanTest extends BaseBatch5ParaBankTest {
    LoginPage loginPage;
    HomePage homePage;
    RequestLoanPage requestLoanPage;


    public RequestLoanTest() {
        super();
    }


    @Test
    public void applyLoanShouldSucceed() {
        loginPage = new LoginPage();
        homePage = loginPage
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(homePage.isLogOutText());

        requestLoanPage = homePage
                .clickRequestLoan()
                .fillAmount(50000)
                .fillDownPayment(1000)
                .clickApplyNowBtn();
        Assert.assertTrue(requestLoanPage.hasNewAccountId());

    }

    @Test
    public void applyLoan2ShouldSucceed() {
        RequestLoanPage requestLoanPage1 = new LoginPage()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn()
                .clickRequestLoan()
                .fillAmount(40000)
                .fillDownPayment(500)
                .clickApplyNowBtn();
        Assert.assertTrue(requestLoanPage1.hasNewAccountId());
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (ITestResult.SUCCESS == result.getStatus()) {
            takeScreenshot(result.getMethod().getMethodName());
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
