package com.sqlLearningAcademy.testng.batchTwo.practices;

import com.sqlLearningAcademy.seleniumWebdriver.batchTwo.practices.pom.util.GeneralUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "smoke", enabled = false)
    public void createMemberShouldSucceed() {
        System.out.println("Member is created successfully");
    }

    @Test(timeOut = 1)
    public void createMemberWithRequiredFieldsShouldSucceed() {
        System.out.println("Member is created successfully");
    }

    @Test
    public void createMemberWithOutRequiredFilesFail() {
        System.out.println("Member is created Fail");
    }

    @Test(groups = "smoke")
    public void updateMemberShouldSucceed() {
        System.out.println("Member update successfully");
    }

    @Test(groups = "smoke")
    public void deleteMemberShouldSucceed() {
        System.out.println("Member update successfully");
    }

    @DataProvider
    public Object[][] getCRMTestData() {
        Object data[][] = GeneralUtil.getTestData("contacts");
        return data;
    }


    @Test(priority = 4, dataProvider = "getCRMTestData")
    public void validateCreateNewContact(String title, String firstName, String lastName, String company) {
        System.out.println(title + " " + firstName + " " + lastName + " " + company);

    }

}
