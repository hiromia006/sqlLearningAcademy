package com.sqlLearningAcademy.java.batch6.collection;

import java.util.*;

public class ListTest{
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Samiran");//0
        strings.add("Samiran");//0
        strings.add("orin");//1
        strings.add("sabbir");//2
        strings.add("Shafi");
        strings.add("Zayed");
        strings.add("Zayed");

        System.out.println("=========================");
        for (String s : strings) {
            System.out.println(s);
        }

        strings.add(2, "Tahia");
        System.out.println("=========================");
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("=========================");
        System.out.println(strings.get(2));

        strings.remove(0);
        System.out.println("=========================");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> fruits = Arrays.asList("Mango", "Orange", "Apple", "banana");
        strings.addAll(fruits);
        strings.removeAll(fruits);

        System.out.println("=========================");
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println(strings.size());

        List<Object> objects = new ArrayList<>();
        objects.addAll(Arrays.asList(1, 2, 3, 4));
        objects.addAll(Arrays.asList("manago", "sadk", "sadnsjka"));
        objects.addAll(Arrays.asList(25.25, 10.10));

        Set<Integer> integers=new HashSet<>();
        integers.add(54);
        integers.add(55);
        objects.addAll(integers);



    }
}
