package com.sqlLearningAcademy.java.batch6.class5.polymorphism;

public class LoginTest {

    public LoginTest(){

    }

    public LoginTest(String username){

    }

    public LoginTest(String username, String password){

    }
    public void doLogin() {
        System.out.println("Login without Username & Password");
    }

    public void doLogin(String usernameOrPassword) {
        System.out.println("Login without Username or Password " + usernameOrPassword);
    }

    public void doLogin(String username, String password) {
        System.out.println("Login with Username & Password " + username + " " + password);
    }

    public static void main(String[] args) {
        LoginTest loginTest = new LoginTest();
        loginTest.doLogin();
        loginTest.doLogin("Jahid");
        loginTest.doLogin("jahid", "jahid1231");
    }

}
