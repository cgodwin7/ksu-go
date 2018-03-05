package com.seniorproject.patrick.ksugo;

/**
 * Created by patri on 3/5/2018.
 */

public class Grades {
    private double grade;
    private String assignment;
    private int studentID;
    private String courseID;
    private String courseSectionNumber;
    public Grades(int grade, String assignment, int studentID, String courseID){
        this.grade=grade;
        this.assignment=assignment;
        this.studentID=studentID;
        this.courseID=courseID;

    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseSectionNumber() {
        return courseSectionNumber;
    }

    public void setCourseSectionNumber(String courseSectionNumber) {
        this.courseSectionNumber = courseSectionNumber;
    }

    public Grades(double grade, String assignment, int studentID, String courseID) {
        this.grade = grade;
        this.assignment = assignment;
        this.studentID = studentID;
        this.courseID=courseID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }
}
