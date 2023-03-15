package com.sqlLearningAcademy.java.batch5.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Account account = new Account();
//        account.setName("Rashed");
//        account.setEmail("rashed@gmail.com");
//        account.setAccountNo(951357489);

        System.out.println(account.getAccountNo());
        System.out.println(account.getName());
        System.out.println(account.getEmail());
    }
}
