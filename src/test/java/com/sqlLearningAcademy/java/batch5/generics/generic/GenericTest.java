package com.sqlLearningAcademy.java.batch5.generics.generic;


public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(584);
        System.out.println(generic.getObj());

        Generic<String> stringGeneric = new Generic<>("Welcome");
        System.out.println(stringGeneric.getObj());

        Generic<Double> doubleGeneric = new Generic<>(6512.50);
        System.out.println(doubleGeneric.getObj());


    }
}
