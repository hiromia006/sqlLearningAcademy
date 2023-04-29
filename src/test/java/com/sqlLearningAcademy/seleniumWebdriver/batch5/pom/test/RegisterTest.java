package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.test;


import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.BaseBatch5ParaBankTest;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseBatch5ParaBankTest {
    public RegisterTest() {
        super();
    }

    @Test
    public void registerShouldSucceed() {
        String username = LoremIpsum.getInstance().getTitle(1);
        String password = LoremIpsum.getInstance().getTitle(1);

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
}
