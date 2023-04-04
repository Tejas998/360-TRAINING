package com.assignment.Task6;

public class EmployeeTask6Three {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public EmployeeTask6Three(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }
    public static void main(String args[]){
        EmployeeTask6Three e1 = new EmployeeTask6Three("Robert", 1994, 50000, "64C- Walls Street");
        EmployeeTask6Three e2 = new EmployeeTask6Three("Sam", 2000, 60000, "68D- Walls Street");
        EmployeeTask6Three e3 = new EmployeeTask6Three("John", 1999, 70000, "26B- Walls Street");

        System.out.format("|-----------------|-------------------|------------|---------------------------|\n");
        System.out.format("| %-15s | %-17s | %-10s | %-25s |\n", "Name", "Year of Joining", "Salary", "Address");
        System.out.format("|-----------------|-------------------|------------|---------------------------|\n");
        System.out.format("| %-15s | %-17d | $%-9.2f | %-25s |\n", e1.name, e1.yearOfJoining, e1.salary, e1.address);
        System.out.format("| %-15s | %-17d | $%-9.2f | %-25s |\n", e2.name, e2.yearOfJoining, e2.salary, e2.address);
        System.out.format("| %-15s | %-17d | $%-9.2f | %-25s |\n", e3.name, e3.yearOfJoining, e3.salary, e3.address);
        System.out.format("|-----------------|-------------------|------------|---------------------------|\n");

    }
}
