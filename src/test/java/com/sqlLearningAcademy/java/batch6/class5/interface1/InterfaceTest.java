package com.sqlLearningAcademy.java.batch6.class5.interface1;

public class InterfaceTest {
    public static void main(String[] args) {
        Bank bank = new CityBank();
        System.out.println("City Bank Interest Rate : " + bank.getInterestRate());

        CityBank cityBank = new CityBank();
        cityBank.givenLoan();
        System.out.println("City Bank Interest Rate2 : " + cityBank.getInterestRate());

        System.out.println(Drawable.drawSquare(30));
        Drawable drawable = new Rectangle();
        drawable.draw();
        drawable.printMessage();

    }
}
