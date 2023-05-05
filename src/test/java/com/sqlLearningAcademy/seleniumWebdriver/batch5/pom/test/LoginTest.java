package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.test;


import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.LoginPage;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseBatch5ParaBankTest {


    public LoginTest() {
        super();
    }

    @Test
    public void loginShouldSucceed() {
//        loginPage = new LoginPage();
//
//        homePage = loginPage
//                .fillUsername(getUsername())
//                .fillPassword(getPassword())
//                .clickLoginBtn();

        HomePage homePage = new LoginPage()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(homePage.isLogOutText());
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
