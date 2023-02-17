package com.sqlLearningAcademy.seleniumWebdriver.batch4.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().addCookie(new Cookie("batch4", "SQA Learning Academy"));
        System.out.println(driver.manage().getCookieNamed("batch4"));

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName());
        }

        driver.manage().deleteCookieNamed("batch4");

        driver.quit();

    }
}
