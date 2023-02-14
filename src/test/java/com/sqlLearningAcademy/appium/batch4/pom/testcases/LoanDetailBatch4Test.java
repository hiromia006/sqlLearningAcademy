package com.sqlLearningAcademy.appium.batch4.pom.testcases;


import com.sqlLearningAcademy.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import com.sqlLearningAcademy.appium.batch4.pom.pages.CalculatorPageBatch4;
import com.sqlLearningAcademy.appium.batch4.pom.pages.HomePage;
import com.sqlLearningAcademy.appium.batch4.pom.pages.LoanDetailPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoanDetailBatch4Test extends BaseEmiCalculatorAppiumBatch4Test {
    CalculatorPageBatch4 calculatorPage;
    LoanDetailPage loanDetailPage;
    @BeforeClass
    public void initialization() {
        calculatorPage = new HomePage()
                .tapEmiCalculatorBtn();
    }

    @Test
    public void calculateLoanShouldSucceed() {
        calculatorPage = calculatorPage
                .fillLoanAmount(250000)
                .fillInterestPercentage(9)
                .fillYear(2)
                .fillMonth(6)
                .fillProcessFee(2)
                .tapCalculatorBtn();
        Assert.assertTrue(calculatorPage.hasDetailBtn());

        loanDetailPage=calculatorPage
                .tapDetailBtn();
        Assert.assertTrue(loanDetailPage.hasLoanAmountResult());
    }
}
