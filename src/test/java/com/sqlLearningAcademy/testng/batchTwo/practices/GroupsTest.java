package com.sqlLearningAcademy.testng.batchTwo.practices;

import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "smoke")
    public void createMemberShouldSucceed() {
        System.out.println("Member is created successfully");
    }

    @Test
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
}
