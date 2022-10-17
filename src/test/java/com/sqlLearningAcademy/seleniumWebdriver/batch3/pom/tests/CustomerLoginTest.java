package com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.tests;

import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.base.ParaBankBaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch3.pom.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerLoginTest extends ParaBankBaseTest {
    HomePage homePage;
    CustomerLoginPage loginPage;

    public CustomerLoginTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        browserSetup();
        loginPage = new CustomerLoginPage();
    }

    @Test
    public void loginShouldSucceed() {
        homePage = loginPage
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(homePage.isLogoutLink());
    }

    @Test
    public void loginWithUsernameShouldFail() {
        loginPage = loginPage
                .fillUsername(getUsername())
                .clickLogin();
        Assert.assertTrue(loginPage.hasErrorMessage());
    }

    @Test
    public void loginWithPasswordShouldFail() {
        loginPage = loginPage
                .fillPassword(getPassword())
                .clickLogin();
        Assert.assertTrue(loginPage.hasErrorMessage());
    }

    @Test
    public void loginShouldFail() {
        loginPage = loginPage
                .clickLogin();
        Assert.assertTrue(loginPage.hasErrorMessage());
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
