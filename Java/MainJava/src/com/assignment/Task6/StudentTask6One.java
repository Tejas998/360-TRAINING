package com.assignment.Task6;

public class StudentTask6One {
    String name;
    int enrollmentNo;
    public StudentTask6One(String name, int enrollmentNo){
        this.name = name;
        this.enrollmentNo = enrollmentNo;
    }

    public static void main(String args[]){
        StudentTask6One task = new StudentTask6One("Amay",123);
        System.out.println("Name: " + task.name);
        System.out.println("Enrollment No: " + task.enrollmentNo);
    }
}
