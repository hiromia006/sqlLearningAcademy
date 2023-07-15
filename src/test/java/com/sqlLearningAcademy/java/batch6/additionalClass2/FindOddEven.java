package com.sqlLearningAcademy.java.batch6.additionalClass2;

public class FindOddEven {
    private int number;

    public FindOddEven() {

    }

    public FindOddEven(int number) {
        this.number = number;
    }


    public void printOddEven() {
        if (number <= 0) {
            System.out.println("Please ignore negative " + number);
        } else if (number % 2 == 0) {
            System.out.println("It is Even number " + number);
        } else {
            System.out.println("It is odd number " + number);
        }
    }

    public static void main(String[] args) {
//        FindOddEven oddEven = new FindOddEven();
//        oddEven.number = 99;
//        oddEven.printOddEven();
//
//        oddEven.number = -55;
//        oddEven.printOddEven();

        FindOddEven oddEven1 = new FindOddEven(13);
        oddEven1.printOddEven();
    }
}
