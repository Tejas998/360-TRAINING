package com.assignment.Task6;

public class StudentTask6Four {
    String name;

    public StudentTask6Four(){
        this.name = "Unknown";
    }
    public StudentTask6Four(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String args[]){
        StudentTask6Four std1 = new StudentTask6Four();
        StudentTask6Four std2 = new StudentTask6Four("Tejas");
        System.out.println("No Name Passed: " + std1.getName());
        System.out.println("Name Passed: " + std2.getName());
    }
}
