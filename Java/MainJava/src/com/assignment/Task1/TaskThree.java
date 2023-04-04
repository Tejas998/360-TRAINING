package com.assignment.Task1;

public class TaskThree {

    public void swapUsingThirdVar(int x, int y){
        int temp = x;
        x = y;
        y = temp;

        System.out.println(" Swap with third var - X : " + x);
        System.out.println(" Swap with third var -  Y : " + y);
        System.out.println(" *********************************  ");
    }

    public void swapWithoutThirdVar(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(" Swap without third var - X : " + x);
        System.out.println(" Swap without third var - Y : " + y);
    }
    public static void main(String args[]){
        int x = 10, y =20;
        TaskThree t3 = new TaskThree();
        t3.swapUsingThirdVar(x,y);
        t3.swapWithoutThirdVar(x, y);
    }
}
