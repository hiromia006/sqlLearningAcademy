package com.sqlLearningAcademy.java.batch6.class5.abstraction;

public class AbstractMain {
    public static void main(String[] args) {

//
//        EblBank eblBank = new EblBank();
//        System.out.println("Show Ebl Bank Current Interest rate " + eblBank.getInterestRate());

        BracBank bankBank = new BracBank();
        System.out.println("Show  Current Interest rate " + bankBank.getInterestRate());
        bankBank.giveCreditCard();
        bankBank.submitIncomeTax();

        BangladeshBank bangladeshBank = new BracBank();
        System.out.println("Show  Current Interest rate " + bangladeshBank.getInterestRate());
        bangladeshBank.submitIncomeTax();


    }
}
