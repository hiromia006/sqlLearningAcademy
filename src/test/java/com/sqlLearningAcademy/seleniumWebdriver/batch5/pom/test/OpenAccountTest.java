package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.test;


import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.LoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.OpenAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseBatch5ParaBankTest {

    public OpenAccountTest() {
        super();
    }

    @Test
    public void openAccountShouldSucceed() {

        OpenAccountPage openAccountPage = new LoginPage()
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn()
                .clickOpenAccountLink()
                .clickOpenNewAccountBtn();
        Assert.assertTrue(openAccountPage.hasNewAccountId());
    }
}
