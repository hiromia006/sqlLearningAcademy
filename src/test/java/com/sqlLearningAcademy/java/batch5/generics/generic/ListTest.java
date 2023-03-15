package com.sqlLearningAcademy.java.batch5.generics.generic;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Faria");
        stringList.add("Nusrat");
        stringList.add("Fatima");
        stringList.add("Ayesha");
        stringList.add("Bishajit");
        stringList.add("sadikur");
        stringList.add("Fahmida");
        stringList.add("Fahmida");
        stringList.add("null");

        System.out.println("===================================================================================");
        stringList.remove(2);
        System.out.println(stringList.get(2));
        System.out.println("===================================================================================");
        stringList.add(2, "Roznin");
        System.out.println("===================================================================================");
        System.out.println(stringList.get(2));
        System.out.println("===================================================================================");


        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
