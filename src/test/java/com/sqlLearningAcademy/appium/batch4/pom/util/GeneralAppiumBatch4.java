package com.sqlLearningAcademy.appium.batch4.pom.util;

import com.appium.batch4.pom.BaseEmiCalculatorAppiumBatch4Test;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GeneralAppiumBatch4 extends BaseEmiCalculatorAppiumBatch4Test {
    final public static int TIME_OUT = 30;

    public static void waitForDomStable() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object[][] getTestData(String sheetName) {
        String path = System.getProperty("user.dir") + "/src/test/java/com/appium/batch4/pom/testData/data.xlsx";
        Workbook book = null;
        Sheet sheet;
        FileInputStream file = null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // System.out.println(sheet.getLastRowNum() + "--------" +
        // sheet.getRow(0).getLastCellNum());
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString().replace(".0", "").trim();
                System.out.println(data[i][k]);
            }
        }
        return data;
    }

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
        FileUtils.copyFile(scrFile, new File(currentDir + System.currentTimeMillis() + ".png"));
    }

}
