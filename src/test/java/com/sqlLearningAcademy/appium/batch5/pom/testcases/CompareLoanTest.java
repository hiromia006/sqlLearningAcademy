package com.sqlLearningAcademy.appium.batch5.pom.testcases;

import com.sqlLearningAcademy.appium.batch5.pom.BaseAppiumBatch5Test;
import com.sqlLearningAcademy.appium.batch5.pom.pages.CompareLoanPage;
import com.sqlLearningAcademy.appium.batch5.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoanTest extends BaseAppiumBatch5Test {
    CompareLoanPage compareLoanPage;

    @Test(priority = 0)
    public void compareLoansShouldSucceed() {
        compareLoanPage = new LandingPage()
                .tabCompareLoansBtn()
                .fillLoanAmount1(100000)
                .fillLoanAmount2(100000)
                .fillInterest1(8)
                .fillInterest2(9)
                .fillPeriod1(12)
                .fillPeriod2(12)
                .tapBtnCalculate();
        Assert.assertTrue(compareLoanPage.hasLayoutTable());
    }

    @Test(priority = 1)
    public void resetCompareLoansShouldSucceed() {
        compareLoanPage = compareLoanPage
                .fillLoanAmount1(100000)
                .fillLoanAmount2(100000)
                .fillInterest1(8)
                .fillInterest2(9)
                .fillPeriod1(12)
                .fillPeriod2(12)
                .tapBtnReset();
        Assert.assertFalse(compareLoanPage.hasLayoutTable());
    }

}