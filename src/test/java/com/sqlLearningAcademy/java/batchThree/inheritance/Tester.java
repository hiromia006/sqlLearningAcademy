package com.sqlLearningAcademy.java.batchThree.inheritance;

public class Tester extends Employee {
    final public double PI_NETWORK = 3.1416;
    int bonus = 10000;

    // getCircleArea method return Circle Area
    /*
    getCircleArea method return Circle Area
    getCircleArea method has one parameter which name is radius
    Formula of Circle Area is Pi * Radius* * Radius
     */
    public double getCircleArea(int radius) {
        // Formula of Circle Area is Pi * Radius* * Radius
        return PI_NETWORK * radius * radius;
    }


    public String getSomeThings() {
        return "SomeThings";
    }

    public void printBonus() {
        System.out.println("You Bonus is : " + bonus);
    }

    public static void main(String args[]) {
        Tester tester = new Tester();
        System.out.println("Circle Area : " + tester.getCircleArea(50));
        System.out.println(tester.getSomeThings());
        tester.printBonus();


    }
}
