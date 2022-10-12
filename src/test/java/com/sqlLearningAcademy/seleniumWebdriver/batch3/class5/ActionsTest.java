package com.sqlLearningAcademy.seleniumWebdriver.batch3.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        new Actions(driver).sendKeys(Keys.CONTROL + "t");

        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.cssSelector("div.nav-menu-container ul li"));
        actions.clickAndHold(webElement).perform();
        Thread.sleep(3000);

        actions.contextClick(webElement).perform();
        Thread.sleep(3000);

        actions.doubleClick(webElement).perform();
        Thread.sleep(3000);

        WebElement webElement1 = driver.findElement(By.cssSelector(" #nav > li:nth-child(2) > a:nth-child(1)"));
        actions.moveToElement(webElement1).click().perform();
        Thread.sleep(3000);

        WebElement webElement2 = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        actions.moveToElement(webElement2).clickAndHold().click().perform();
        Thread.sleep(3000);

        driver.quit();
    }
}
