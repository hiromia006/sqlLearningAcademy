package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.test;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.pages.OpenNewAccountPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest {
    OpenNewAccountPage openNewAccountPage;

    public OpenNewAccountTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        openNewAccountPage = new CustomerLoginPage()
                .login(getUsername(), getPassword())
                .clickOpenAccount();

    }

    @Test
    public void openNewAccountShouldSucceed() {
        openNewAccountPage = openNewAccountPage
                .selectAccountType(0)
                .selectFromAccountId(0)
                .clickCreateAccount();
        Assert.assertTrue(openNewAccountPage.hasNewAccountId());
    }

    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
