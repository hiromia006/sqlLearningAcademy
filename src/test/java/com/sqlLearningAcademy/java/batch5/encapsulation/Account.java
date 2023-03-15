package com.sqlLearningAcademy.java.batch5.encapsulation;

// Fully Encapsulation
public class Account {
    private String email="fari@gmail.com";
    private String name="Fatima";
    private long accountNo=123456789;


//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAccountNo(long accountNo) {
//        this.accountNo = accountNo;
//    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public long getAccountNo() {
        return accountNo;
    }
}
