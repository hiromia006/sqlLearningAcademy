package com.sqlLearningAcademy.restAssured.batch3.tests.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Student {
    @JsonProperty("name")
    private String name;

    @JsonProperty("batchId")
    private Integer batchId;

    @JsonProperty("contactNo")
    private String contactNo;

    @JsonProperty("id")
    private Integer id;


    /**
     * No args constructor for use in serialization
     */
    public Student() {
    }

    /**
     * @param name
     * @param batchId
     * @param contactNo
     */
    public Student(Integer batchId, String name, String contactNo) {
        this.name = name;
        this.batchId = batchId;
        this.contactNo = contactNo;
    }


    public Student(Integer batchId, String name, String contactNo, Integer id) {
        this.batchId = batchId;
        this.name = name;
        this.contactNo = contactNo;
        this.id=id;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public Integer getId() {
        return id;
    }

}