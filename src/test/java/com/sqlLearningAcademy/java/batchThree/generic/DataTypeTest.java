package com.sqlLearningAcademy.java.batchThree.generic;
//<>
public class DataTypeTest<T> {
    private T dataType;

    public DataTypeTest(T dataType) {
        this.dataType = dataType;
    }

    public T getDataType() {
        return dataType;
    }
}
