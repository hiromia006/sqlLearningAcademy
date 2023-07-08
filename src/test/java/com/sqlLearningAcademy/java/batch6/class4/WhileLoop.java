package com.sqlLearningAcademy.java.batch6.class4;

public class WhileLoop {
    public static void main(String[] args) {
//        for (int i = 0; i <= 15; ++i) {
//            System.out.println("class number " + i);
//        }



        int i = 0;
        while (i <= 2) {
            System.out.println(i);
            i++;
        }

        System.out.println("=====================================");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 2);

    }
}
