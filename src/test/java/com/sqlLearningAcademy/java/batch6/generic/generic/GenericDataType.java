package com.sqlLearningAcademy.java.batch6.generic.generic;

import java.util.Arrays;
import java.util.List;

public class GenericDataType {
    public static void main(String[] args) {
        DataType<Integer> integerDataType = new DataType<>(100);
        System.out.println(integerDataType.getDataType());

        DataType<Long> longDataType = new DataType<>(26544l);
        System.out.println(longDataType.getDataType());

        DataType<String> stringDataType = new DataType<>("Welcome to Six Batch");
        System.out.println(stringDataType.getDataType());

        List<Integer> integers= Arrays.asList(51,25,65,98);
        List<Long> longs= Arrays.asList(51l,25l,65l,98l);


    }
}
