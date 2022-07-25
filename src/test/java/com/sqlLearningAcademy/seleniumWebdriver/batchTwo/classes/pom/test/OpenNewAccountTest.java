package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.test;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.LoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.OpenNewAccountPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {
    OpenNewAccountPage openNewAccountPage;
    LoginPage loginPage;
    HomePage homePage;


    public OpenNewAccountTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
//        openNewAccountPage = new LoginPage()
//                .login(getUsername(), getPassword())
//                .clickOpenAccountLink();

        loginPage = new LoginPage();
        homePage = loginPage.login(getUsername(), getPassword());
        openNewAccountPage = homePage.clickOpenAccountLink();
    }

    @Test
    public void openNewAccountShouldSucceed() {
        openNewAccountPage = openNewAccountPage
                .selectAccountType(0)
                .selectAmount(0)
                .clickNewAccountBtn();
        Assert.assertTrue(openNewAccountPage.hasAccountId());
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
