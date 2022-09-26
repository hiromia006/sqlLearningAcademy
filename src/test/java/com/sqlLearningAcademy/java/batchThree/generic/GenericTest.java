package com.sqlLearningAcademy.java.batchThree.generic;

public class GenericTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest("SQA Learning Academy");
        System.out.println(stringTest.getString());

        IntegerTest integerTest = new IntegerTest(8777);
        System.out.println(integerTest.getInteger());

        DoubleTest doubleTest = new DoubleTest(565.25);
        System.out.println(doubleTest.getaDouble());

        DataTypeTest<String> dataTypeTest = new DataTypeTest<>("SQA Learning Academy");
        System.out.println(dataTypeTest.getDataType());

        DataTypeTest<Integer> dataTypeTest2 = new DataTypeTest<>(6456);
        System.out.println(dataTypeTest2.getDataType());

        DataTypeTest<Double> dataTypeTest3 = new DataTypeTest<>(6456.25);
        System.out.println(dataTypeTest3.getDataType());


        DataTypeTest<Long> dataTypeTest4 = new DataTypeTest<>(6456l);
        System.out.println(dataTypeTest4.getDataType());

        DataTypeTest<Object> dataTypeTest5 = new DataTypeTest<>("sadiasjkd");
        System.out.println(dataTypeTest4.getDataType());
    }
}
