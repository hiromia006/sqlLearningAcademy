package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.test;


import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.LoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.RegisterPage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.util.GeneralUtil;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterTest extends BaseBatch5ParaBankTest {
    public RegisterTest() {
        super();
    }

    @Test
    public void registerShouldSucceed() {
        String username = LoremIpsum.getInstance().getTitle(1);
        String password = LoremIpsum.getInstance().getTitle(1);
        // Login Page >> Register Page >> Home Page
//        LoginPage loginPage = new LoginPage();
//        RegisterPage registerPage = loginPage
//                .clickRegisterLinkBtn();
//
//        registerPage = registerPage
//                .fillFirstName(LoremIpsum.getInstance().getFirstName())
//                .fillLastName(LoremIpsum.getInstance().getLastName())
//                .fillAddress(LoremIpsum.getInstance().getTitle(3))
//                .fillCity(LoremIpsum.getInstance().getCity())
//                .fillState(LoremIpsum.getInstance().getStateFull())
//                .fillZipCode(LoremIpsum.getInstance().getZipCode())
//                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
//                .fillSsn(LoremIpsum.getInstance().getPhone())
//                .fillUsername(username)
//                .fillPassword(username)
//                .fillConfirm(username);
//
//        HomePage homePage = registerPage
//                .clickRegisterBtn();

        HomePage homePage = new LoginPage()
                .clickRegisterLinkBtn()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getStateFull())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhoneNumber(LoremIpsum.getInstance().getPhone())
                .fillSsn(LoremIpsum.getInstance().getPhone())
                .fillUsername(username)
                .fillPassword(password)
                .fillConfirm(password)
                .clickRegisterBtn();
        Assert.assertTrue(homePage.isLogOutText());

//        ReadAndWriteProperties.writePropertyValue("username", username);
//        ReadAndWriteProperties.writePropertyValue("password", password);

    }


    @Test(dataProvider = "batch5DDT")
    public void registerUsingDdtShouldSucceed(String fistName, String lastName, String address, String city, String state) {
        RegisterPage registerPage = new LoginPage()
                .clickRegisterLinkBtn()
                .fillFirstName(fistName)
                .fillLastName(lastName)
                .fillAddress(address)
                .fillCity(city)
                .fillState(state)
                .clickRegister();
        Assert.assertTrue(registerPage.getErrorCount() > 0);

    }


    @DataProvider(name = "batch5DDT")
    public Object[][] getSignupDataFromExcel() {
        return GeneralUtil.getTestData("Sheet1");
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
