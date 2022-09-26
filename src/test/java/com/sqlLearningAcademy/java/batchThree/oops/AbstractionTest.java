package com.sqlLearningAcademy.java.batchThree.oops;

public class AbstractionTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        BracBank bracBank = new BracBank();
        System.out.println("Dollar to BDT : " + bracBank.getDollarRate() * 100);
        bracBank.printTwoTakaNote();

        System.out.println(BracBank.getInterestRate());
        System.out.println(BracBank.reserveMoney);
        System.out.println(BangladeshBank.reserveMoney);

        CityBankAgent cityBankAgent = new CityBankAgent();
        System.out.println("10000 Interest : " + 10000 * cityBankAgent
                .rateOfInterest());
        cityBankAgent.printDollarRate();
    }
}
