package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.testcases;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.RegisterPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterTest extends BaseSeleniumBatch4Test {
    RegisterPage registerPage;

    public RegisterTest() {
        super();
    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
    }

    @Test
    public void registerShouldSucceed() {
        String firstName = LoremIpsum.getInstance().getFirstName();

        registerPage = new CustomerLoginPage()
                .clickRegisterLink()
                .fillFirstName(firstName)
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(2))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateFull())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSsn("522-83-1308")
                .fillUsername(firstName)
                .fillPassword(firstName)
                .fillConfirmPassword(firstName)
                .clickRegisterBtn();
        Assert.assertTrue(registerPage.hasMessage());

    }

    @AfterClass
    public void tearDown() {
        GeneralSeleniumBatchFour.domStable();
        driver.quit();
    }
}
