package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.test;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.LoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginShouldSucceed() {
        HomePage homePage = loginPage
                .login(getUsername(), getPassword());

        Assert.assertTrue(homePage.isLogoutLink());
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();

    }
}
