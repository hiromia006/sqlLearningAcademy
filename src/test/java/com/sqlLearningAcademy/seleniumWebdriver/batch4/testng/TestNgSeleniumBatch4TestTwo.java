package com.sqlLearningAcademy.seleniumWebdriver.batch4.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgSeleniumBatch4TestTwo extends BaseSeleniumBatch4TestTwo {

    @Test(priority = 2)
    public void verifyLoginPage() {
        String loginText = driver.findElement(By.cssSelector("div#leftPanel h2")).getText().trim();
        Assert.assertEquals(loginText, "Customer Login");
    }

    @Test(priority = 1)
    public void verifyAboutUs() {
        WebElement aboutEl = driver.findElement(By.cssSelector("ul.leftmenu  a[href='about.htm']"));
        aboutEl.isDisplayed();
        aboutEl.click();
        Assert.assertTrue(driver.getPageSource().contains("888-305-0041"));
    }

    @Test(priority = 1)
    public void verifyForgetPassword(){
        WebElement element=driver.findElement(By.cssSelector("a[href='lookup.htm']"));
        element.isDisplayed();
        Assert.assertEquals(element.getText().trim(), "Forgot login info?");
    }
}
