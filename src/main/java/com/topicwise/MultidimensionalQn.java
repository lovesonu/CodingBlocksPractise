package com.topicwise;

import java.util.Scanner;

public class MultidimensionalQn {

    public static void printMultiDimensionalArray() {
        int ar[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        //input array element
        System.out.println("Enter the element of array");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        //printing the multidimensonnal array
        System.out.println("Print multi dimensional array");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println(" ");
        }

        //for first diagonal
        System.out.println("for first diagonal");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                if ((i + j) == ar.length - 1) {
                    System.out.print(ar[i][j] + "  ");
                }
            }
        }

        System.out.println("for secondary diagonal");
        //for secondary diagonal
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                if (i == j) {
                    System.out.print(ar[i][j] + "  ");
                }
            }
        }


        System.out.println(" // Diagonal print  ");
        for (int i = 0; i < ar.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.print(ar[i][j]+" ");
                }
            } else {

                for (int j = ar[i].length - 1; j >= 0; j--) {
                    System.out.print(ar[i][j]+" ");
                }
            }
        }

        System.out.println("// column wise");


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("row wise print");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[j][i] + " ");
            }
            System.out.println(" ");
        }
/*
        System.out.println(" >>>>>>>>> AMA <<<<<<<<");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ar[j][i] + " ");
                i--;
            }
            System.out.println(" ");
        }*/

    }


    public static void main(String[] args) {
        printMultiDimensionalArray();
    }
}
