package com.sqlLearningAcademy.seleniumWebdriver.batch5.pom.util;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GeneralUtil {
    public final static int WAIT_TIME = 30;

    public static Object[][] getTestData(String sheetName) {
        String path = System.getProperty("user.dir") + "/src/test/java/com/parabank/pom/testdata/ddt.xlsx";
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
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                System.out.println(data[i][k]);
            }
        }
        return data;
    }
}
