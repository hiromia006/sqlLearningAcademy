package com.sqlLearningAcademy.seleniumWebdriver.batch4.test.testcases;


import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.baseTest.BaseSeleniumBatch4Test;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.CustomerLoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.OverviewPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.pages.UpdateProfilePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch4.test.util.GeneralSeleniumBatchFour;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateProfileTest extends BaseSeleniumBatch4Test {
    OverviewPage overviewPage;
    UpdateProfilePage updateProfilePage;

    public UpdateProfileTest() {
        super();
    }

    @BeforeClass
    public void initialization() {
        setUpBrowser();
        overviewPage = new CustomerLoginPage()
                .login(getUserName(), getPassword());
    }

    @Test
    public void updateProfileShouldSucceed() {
        updateProfilePage = overviewPage
                .clickUpdateProfileLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .clickUpdateProfileBtn();
        Assert.assertTrue(updateProfilePage.hasPhoneNumber());
        updateProfilePage.clickLogOutBtn();

    }

    @AfterClass
    public void tearDown() {
        GeneralSeleniumBatchFour.domStable();
        driver.quit();
    }
}
