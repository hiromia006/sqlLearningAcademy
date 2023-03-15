package com.sqlLearningAcademy.java.batch5.generics.generic;

public class Generic<T> {
    private T obj;

    public Generic(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
