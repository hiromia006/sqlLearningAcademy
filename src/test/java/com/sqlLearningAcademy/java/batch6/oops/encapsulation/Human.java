package com.sqlLearningAcademy.java.batch6.oops.encapsulation;

public class Human {
    private int salary = 30000;
    public String designation;
    public String name;

    public Human() {
    }

    public Human(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    private void printSalary() {
        System.out.println(name + " salary is " + salary);
    }

    public void printDesignation() {
        System.out.println(name + " is " + designation);
    }

    public static void main(String[] args) {
        Human human=new Human();
        human.name="Taiba";
        human.designation="SQA";
        human.salary=3300;
        human.printDesignation();
        human.printSalary();

        Human human1=new Human("Orin", "Sr SQA");
        human1.printSalary();
        human1.printDesignation();

    }

}
