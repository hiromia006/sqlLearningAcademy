package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.testcases;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.OverviewPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerLoginSeleniumBatch4Test extends BaseSeleniumBatch4Test {
    CustomerLoginPage loginPage;
    OverviewPage overviewPage;

    @BeforeClass
    public void init() {
        setUpBrowser();
    }

    public CustomerLoginSeleniumBatch4Test() {
        super();
    }

    @Test(priority = 1)
    public void loginShouldSucceed() {
        loginPage = new CustomerLoginPage();
        overviewPage = loginPage
                .fillUsername(getUserName())
                .fillPassword(getPassword())
                .clickLoginBtn();

        Assert.assertTrue(overviewPage.isLogoutLink());

//        OverviewPage overviewPage = new CustomerLoginPage()
//                .fillUsername(getUserName())
//                .fillPassword(getPassword())
//                .clickLoginBtn();

    }

    @Test(enabled = false)
    public void loginShouldSucceed2() {
        loginPage = new CustomerLoginPage();
        overviewPage = loginPage
                .login(getUserName(), getPassword());
        Assert.assertTrue(overviewPage.isLogoutLink());

//        Assert.assertTrue(new CustomerLoginPage().login(getUserName(), getPassword()).isLogoutLink());


    }

    @Test(priority = 0)
    public void loginShouldFail() {
        loginPage = new CustomerLoginPage()
                .login(getUserName());
        Assert.assertTrue(loginPage.hasError());

    }


    @AfterClass
    public void tearDown() {
        GeneralSeleniumBatchFour.domStable();
        driver.quit();
    }
}
