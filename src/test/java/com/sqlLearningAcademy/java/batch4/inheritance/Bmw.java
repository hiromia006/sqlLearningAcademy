package com.sqlLearningAcademy.java.batch4.inheritance;

public class Bmw extends Car {

    @Override
    public void speed(){
        System.out.println("Speed is 100");
    }
    public static void main(String[] args) {
        Bmw bmw = new Bmw();
        bmw.model = "askdklsaj";
        bmw.speed();
    }
}
