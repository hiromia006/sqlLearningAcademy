package com.sqlLearningAcademy.seleniumWebdriver.batch4.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > a:nth-child(1)"));

//        actions.clickAndHold(webElement).perform();
//        Thread.sleep(3000);
//        actions.contextClick(webElement).perform();

        actions.click(webElement).perform();
        Thread.sleep(3000);
        WebElement webElement1 = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1)"));
        actions.moveToElement(webElement1).perform();
        Thread.sleep(3000);
        WebElement webElement2 = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"));
        actions.doubleClick(webElement2).perform();
        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/droppable");
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement droppable=driver.findElement(By.id("droppable"));

        actions.dragAndDrop(draggable, droppable).perform();
        Thread.sleep(3000);


        driver.quit();
    }
}
