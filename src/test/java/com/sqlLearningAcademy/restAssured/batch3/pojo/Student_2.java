package com.sqlLearningAcademy.restAssured.batch3.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student_2 {

    @JsonProperty("name")
    public String name;

    @JsonProperty("batchId")
    public Integer batchId;

    @JsonProperty("contactNo")
    public String contactNo;


    /**
     * No args constructor for use in serialization
     */
    public Student_2() {
    }

    /**
     * @param name
     * @param batchId
     * @param contactNo
     */
    public Student_2(String name, Integer batchId, String contactNo) {
        super();
        this.name = name;
        this.batchId = batchId;
        this.contactNo = contactNo;
    }

}