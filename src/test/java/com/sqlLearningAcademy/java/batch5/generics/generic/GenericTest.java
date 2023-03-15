package com.sqlLearningAcademy.java.batch5.generics.generic;

import com.practice.batch5.abstraction.interface1.Circle;

public class GenericTest {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(584);
        System.out.println(generic.getObj());

        Generic<String> stringGeneric = new Generic<>("Welcome");
        System.out.println(stringGeneric.getObj());

        Generic<Double> doubleGeneric = new Generic<>(6512.50);
        System.out.println(doubleGeneric.getObj());

        Generic<Circle> circleGeneric = new Generic<>(new Circle());
        System.out.println(circleGeneric.getObj());

    }
}
