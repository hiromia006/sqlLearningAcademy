package com.sqlLearningAcademy.java.batchThree.oops;

public class CityBankAgent implements CityBank, AbBank {
    @Override
    public float rateOfInterest() {
        return 8.0f;
    }
}
