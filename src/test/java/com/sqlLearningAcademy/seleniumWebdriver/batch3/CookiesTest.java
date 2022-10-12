package com.sqlLearningAcademy.seleniumWebdriver.batch3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Set;

public class CookiesTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://parabank.parasoft.com/");

        driver.manage().addCookie(new Cookie("Learner", "646565"));
        driver.manage().addCookie(new Cookie("explorer", "explorer646565"));
        driver.manage().addCookie(new Cookie("explorer2", "explorer2646565"));

        System.out.println(" Get " + driver.manage().getCookieNamed("explorer"));
        System.out.println("===================================================");
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(driver.manage().getCookieNamed(cookie.getName()));
        }

        System.out.println("===================================================");
        driver.manage().deleteCookieNamed("explorer");
        cookies = driver.manage().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(driver.manage().getCookieNamed(cookie.getName()));
        }
        System.out.println("===================================================");
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());

        driver.quit();
    }
}
