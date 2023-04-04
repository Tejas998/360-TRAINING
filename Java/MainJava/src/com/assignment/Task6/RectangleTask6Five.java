package com.assignment.Task6;
public class RectangleTask6Five {
    double length, breadth;

    public double calculateArea(){
        return  length*breadth;
    }
    public RectangleTask6Five(){
        this.length = 7;
        this.breadth = 7;
    }

    public RectangleTask6Five(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public RectangleTask6Five(double number) {
        this.length = number;
        this.breadth = number;
    }

    public static void main(String[] args) {
        RectangleTask6Five rectangle1 = new RectangleTask6Five();
        RectangleTask6Five rectangle2 = new RectangleTask6Five(7, 7);
        RectangleTask6Five rectangle3 = new RectangleTask6Five(7);

        System.out.println("Area of rectangle 1: " + rectangle1.calculateArea());
        System.out.println("Area of rectangle 2: " + rectangle2.calculateArea());
        System.out.println("Area of rectangle 3: " + rectangle3.calculateArea());

    }
}
