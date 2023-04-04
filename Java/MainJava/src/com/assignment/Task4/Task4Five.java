package com.assignment.Task4;
public class Task4Five {

    public static void main(String args[]) {

        int arr1[][] = {{1,2,3}, {1,2,3}, {4,3,4}};
        int arr2[][] = {{1,2,3}, {1,2,3}, {4,3,4}};

        int resultArr[][] = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                resultArr[  i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(resultArr[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
