package com.sqlLearningAcademy.appium.batch5.pom.testcases;


import com.sqlLearningAcademy.appium.batch5.pom.BaseAppiumBatch5Test;
import com.sqlLearningAcademy.appium.batch5.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseAppiumBatch5Test {
    LandingPage landingPage;

    @Test
    public void emiCalculatorBtnShouldBeShown() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEmilCalculatorBtn());
    }

    @Test
    public void CompareLoansBtnShouldBeShown() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isCompareLoansBtn());
    }
}