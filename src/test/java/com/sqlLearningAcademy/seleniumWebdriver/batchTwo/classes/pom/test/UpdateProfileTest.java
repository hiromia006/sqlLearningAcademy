package com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.test;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.base.BaseTest;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.HomePage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.LoginPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.OpenNewAccountPage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.classes.pom.pages.UpdateProfilePage;
import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UpdateProfileTest extends BaseTest {
    UpdateProfilePage updateProfilePage;
    LoginPage loginPage;
    HomePage homePage;

    public UpdateProfileTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(getUsername(), getPassword());
        updateProfilePage = homePage.clickUpdateProfileLink();
    }

    @DataProvider
    public Object[][] getTestData() {
        Object data[][] = GeneralUtil.getTestData("contacts");
        return data;
    }

    @Test(dataProvider = "getTestData")
    public void updateProfileShouldSucceed(String title, String firstName, String lastName, String company) {
        System.out.println(title + " " + firstName + " " + lastName + " " + company);
        updateProfilePage = updateProfilePage
                .fillFirstName(firstName)
                .fillLastName(lastName)
                .clickUpdateProfileBtn();
    }


    @AfterMethod
    public void tearDown() {
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
