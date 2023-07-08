package com.sqlLearningAcademy.java.batch6.class1;

public class SoftwareTester {
   protected String name;
    int salary;


    public SoftwareTester() {

    }

    public void doTesting() {
        System.out.println(name + " finds a bug");
    }

    // access modifier, return type, methodName()

    public int getSalary(){
      return salary;
    }

    public static void main(String[] args) {
        SoftwareTester tester = new SoftwareTester();
        tester.name="Noman";
        tester.salary=30000;
        tester.doTesting();
        System.out.println("Noman draw salary "+tester.getSalary() );

    }
}
