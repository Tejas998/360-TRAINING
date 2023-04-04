package com.assignment.Task6;

public class TriangleTask6Two {
    int a = 5, b = 6, c = 7;

    public double getPerimeter() {
        return a + b + c;
    }
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String args[]){
        TriangleTask6Two triangle = new TriangleTask6Two();
        System.out.println("Perimeter is: " + triangle.getPerimeter());
        System.out.println("Area is: " + triangle.getArea());

    }
}
