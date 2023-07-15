package com.sqlLearningAcademy.java.batch6.generic.generic;

public class NumberDataType<T extends Number> {
    private T dataType;

    public NumberDataType(T dataType) {
        this.dataType = dataType;
    }

    public T getDataType() {
        return dataType;
    }
}
