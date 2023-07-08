package com.sqlLearningAcademy.java.batch6.class4;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {

        List<String> strings=new ArrayList<>();


        int numbers[] = {1, 2, 3, 4, 5, 6};

        for (int abcd : numbers) {
            System.out.println(abcd);
        }

        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        System.out.println("====================================");

        String[] names = {"shafi", "tahia", "sabbir"};
        for (String str : names) {
            System.out.println(str);
        }

        System.out.println("====================================");

        double[] money = {25.5, 900.2, 107};
        for (double d : money) {
            System.out.println(d);
        }

    }
}
