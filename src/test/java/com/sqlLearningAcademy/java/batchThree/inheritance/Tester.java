package com.sqlLearningAcademy.java.batchThree.inheritance;

public class Tester extends Employee {
    int bonus = 10000;

    public static void main(String args[]) {
        Tester tester = new Tester();
        System.out.println("Tester Salary : " + tester.salary);
        System.out.println("Tester bonus : " + tester.bonus);
        tester.work();
    }
}
