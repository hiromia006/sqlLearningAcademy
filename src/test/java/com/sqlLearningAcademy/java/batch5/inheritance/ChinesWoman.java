package com.sqlLearningAcademy.java.batch5.inheritance;

public class ChinesWoman extends Woman {
    public int hairLength = 5;

    @Override
    public void eat() {
        int dailyMeal = 2;
        System.out.println("ChinesWoman eats " + dailyMeal + " times Noddle");
    }

    public static void main(String[] args) {
        ChinesWoman chinesWoman = new ChinesWoman();
        System.out.println(chinesWoman.hairLength);
        chinesWoman.eat();

    }
}
