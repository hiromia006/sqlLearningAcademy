package com.sqlLearningAcademy.java.batch6.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(85);
        integers.add(85);
        integers.add(99);
        integers.add(50);
        integers.add(75);
        integers.remove(50);

        Set<Integer> integers1=new HashSet<>();
        integers1.add(10);
        integers1.add(10);
        integers1.add(10);
        integers.addAll(integers1);

        for (Integer i : integers) {
            System.out.println(i);
        }



    }
}
