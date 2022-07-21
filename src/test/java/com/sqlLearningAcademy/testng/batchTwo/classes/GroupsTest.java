package com.sqlLearningAcademy.testng.batchTwo.classes;

import org.testng.annotations.Test;

public class GroupsTest {
    @Test(priority = 0, groups = "smoke, regression")
    public void createMemberShouldSucceed() {
        System.out.println("Member is created successfully");
    }

    @Test(priority = 1)
    public void createMemberWithRequiredFieldsShouldSucceed() {
        System.out.println("Member is created successfully");
    }

    @Test(priority = 2, description="slafjlasskjflksaj", dependsOnGroups = "createMemberShouldSucceed")
    public void createMemberWithOutRequiredFilesFail() {
        System.out.println("Member is created Fail");
    }

    @Test(priority = 3, groups = "smoke")
    public void updateMemberShouldSucceed() {
        System.out.println("Member update successfully");
    }

    @Test(priority = 3, groups = "smoke")
    public void deleteMemberShouldSucceed() {
        System.out.println("Member update successfully");
    }
}
