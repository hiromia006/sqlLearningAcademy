package com.sqlLearningAcademy.java.batch6.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Tiger");
        map.put("id", 12);

        System.out.println(map);

    }
}
