package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom;

import com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.util.GeneralUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public abstract class BaseBatch5ParaBankTest {
    private Properties properties;
    public static WebDriver driver;


    public BaseBatch5ParaBankTest() {
        try {

            String filePath = System.getProperty("user.dir") + "/src/test/resources/config.properties";
            properties = new Properties();

            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @BeforeMethod
    public void browserSetup() {
        String browserName = getBrowserName();
        if (browserName.equals("firefox")) {
            //logging disable
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equals("headless")) {
            //disable Firefox logging
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

            WebDriverManager.firefoxdriver().setup();
            //headless
            FirefoxOptions firefoxOptions = new FirefoxOptions();
//            firefoxOptions.setHeadless(true);
            firefoxOptions.addArguments("-headless");
            driver = new FirefoxDriver(firefoxOptions);

        }
        driver.get(getBaseUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GeneralUtil.WAIT_TIME));
        driver.manage().window().maximize();

    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getBrowserName() {
        return properties.getProperty("browserName");
    }

//    @AfterMethod
//    public void tearDown() throws InterruptedException {
//        Thread.sleep(8000);
//        driver.quit();
//    }

    public static void takeScreenshot(String fileName) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + fileName + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
