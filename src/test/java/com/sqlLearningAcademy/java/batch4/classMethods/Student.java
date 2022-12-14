package com.sqlLearningAcademy.java.batch4.classMethods;

public class Student {
    private long id;
    public String name;
    protected String contactNumber;
    String subject;

    private void giveExam() {
        System.out.println("Student have to sit exam");

    }

    void submitAssignment() {
        System.out.println("Student have to Submit Assignment");

    }

    protected void enrollCourse() {
        System.out.println("Every Student enroll Course");
    }

    public void study() {
        System.out.println("Every Student study");
    }

    public void getMark( int mark) {
        System.out.println("Your mark is " + mark);
    }

    public long getName() {
        return id;
    }

    public static void main(String[] args) {
        Student sqaLearningAcademyStudent = new Student();
        sqaLearningAcademyStudent.getMark(46);
    }
}
