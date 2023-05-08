package com.sqlLearningAcademy.appium.batch5.pom.testcases;


import com.sqlLearningAcademy.appium.batch5.pom.BaseAppiumBatch5Test;
import com.sqlLearningAcademy.appium.batch5.pom.pages.EmiCalculatorPage;
import com.sqlLearningAcademy.appium.batch5.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseAppiumBatch5Test {
    LandingPage landingPage;
    EmiCalculatorPage emiCalculatorPage;


    @Test
    public void emiCalculateShouldSucceed() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEmilCalculatorBtn());

        emiCalculatorPage = landingPage.tabEmilCalculatorBtn()
                .fillAmount(500000)
                .fillInterestRate(9)
                .fillYeas(1)
                .fillMonths(6)
                .fillFee(2)
                .tabCalculateBtn();
        Assert.assertTrue(emiCalculatorPage.hasBtnDetail());

    }


    @Test
    public void resetEmiCalculateShouldSucceed() {
        emiCalculatorPage = emiCalculatorPage
                .fillAmount(500000)
                .fillInterestRate(9)
                .fillYeas(1)
                .fillMonths(6)
                .fillFee(2)
                .tabCalculateBtn()
                .tabResetBtn();
//        Assert.assertFalse(emiCalculatorPage.hasLayoutTable());
    }


}
