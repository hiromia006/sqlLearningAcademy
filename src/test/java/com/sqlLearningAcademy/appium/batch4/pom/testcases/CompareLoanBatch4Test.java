package com.sqlLearningAcademy.appium.batch4.pom.testcases;

import com.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import com.appium.batch4.pom.pages.CompareLoanPage;
import com.appium.batch4.pom.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoanBatch4Test extends BaseEmiCalculatorAppiumBatch4Test {
    HomePage homePage;
    CompareLoanPage compareLoanPage;

    @Test
    public void calculateShouldSucceed() {
        homePage = new HomePage();
        compareLoanPage = homePage
                .tapCompareLoanBtn()
                .fillLoanAmount1(15000)
                .fillLoanAmount2(20000)
                .fillLoanInterest1(9)
                .fillLoanInterest2(10)
                .fillLoanPeriod1(24)
                .fillLoanPeriod2(24)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoanPage.hasResult());

    }

    @Test
    public void resetShouldSucceed() {
        compareLoanPage = compareLoanPage
                .fillLoanAmount1(15000)
                .fillLoanAmount2(20000)
                .fillLoanInterest1(9)
                .fillLoanInterest2(10)
                .fillLoanPeriod1(24)
                .fillLoanPeriod2(24)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoanPage.hasResult());

        compareLoanPage = compareLoanPage
                .tapResetBtn();
        Assert.assertFalse(compareLoanPage.hasResult());

    }

}
