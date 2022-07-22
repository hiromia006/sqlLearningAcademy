package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.test;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages.DashBoardPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    DashBoardPage dashBoardPage;
    CustomerLoginPage loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new CustomerLoginPage();
    }

    @Test
    public void loginShouldSucceed() {
        dashBoardPage = loginPage.login(getUsername(), getPassword());
        Assert.assertTrue(dashBoardPage.hasLogoutLink());
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
