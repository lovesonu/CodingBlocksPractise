package com.assn.day1;

//Assignment 2 after 2 lec

import java.util.Scanner;

public class Assignment2 {

    public static void a2q1() {
        //Take N as input. If the number is prime, print “Prime” otherwise print “Not Prime”.

        int n = 7;
        int i = 2;
        boolean flag = false;

        while (i <= n / 2) {
            if (n % i == 0) {
                flag = false;
            } else {
                flag = true;
            }
            i++;
        }
        if (flag = true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    // Lec 2 : 1:21
    /*

     *
     * *
     * * *
     * * * *

     */
    public void rightAngle() {
        int n = 4;
        int row = 0;
        while (row <= n) {
            int col = 0;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            row++;
            System.out.println();
        }
    }


    public static void number() {

        /*
        1
        2 3
        4 5 6
        7 8 9 10

         */
        int row = 1;
        int n = 4;
        int a = 1;
        /*for (row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(a++ + " ");
            }
            System.out.println(a++);
        }*/


        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(a++ + " ");
                col++;
            }
            System.out.println(a++);
        }
        row++;
    }


    public static void reverseCount() { //*
        int n = 123;
        int rev = 0;
        int rema = 0;

        while (n > 0) {
            rema = rev % 10;
            rev = rev * 10 + rema;
            n = n / 10;
            n++;
        }
        System.out.println(rev);
    }

    public static void patter8() {
        // 56 : 47 lec 3
        int n = 5;
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (col == 1 || col == row) {
                    System.out.print(row + " ");
                } else {
                    System.out.print("0 ");
                }
                col++;
            }
            row++;
            System.out.println();

        }


    }

    public static void pattern11() {

        int row = 1;
        int j = 1;
        int n = 3;

        while (row <= n) {
            while (j <= row) {
                System.out.println("*");
            }
            System.out.println();
            j++;

        }


        row++;
    }

    public static void patternQ11() {
        /*
         *
         *  *   *
         * *  *   * *
         *  *   *
         *
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n / 2 + 1;

        int row = 1;
        int p = 1;

        while (p <= 2 * n - 1) {

            int space = 1;

            while (space <= n - row) {
                System.out.print(" " + "\t");
                space++;
            }

            int col = 1;

            while (col <= 2 * row - 1) {
                System.out.print("*" + "\t");
                col++;
            }

            System.out.println();

            if (p < n) {
                row++;
            } else {
                row--;
            }
            p++;
        }


    }

    public static void patter11() {

        int i, j, n = 3;

        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {

                System.out.print("*");
            }

            for (j = 1; j <= (2 * i - 2); j++) {
                System.out.print(" ");
            }

            for (j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower pattern
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (j = (2 * i - 2); j < (2 * n - 2); j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }


    public static void pascalTriangle() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            // Every line has number of
            // integers equal to line number
            for (int j = 0; j <= i; i++)
                System.out.print(binomialCoeff(i, j) + " ");

            System.out.println();
        }
    }

    public static int binomialCoeff(int n, int k) {
        int result = 1;
        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i)
        {
            result *= (n - i);
            result /= (i + 1);
        }


        return result;
    }

    public static void main(String[] args) {
//        Assignment2.number();
//        Assignment2.reverseCount();
//        Assignment2.reverseCount();
//        Assignment2.patter8();
//        patter11();
//        patternQ11();
//        a2q1();
        pascalTriangle();
    }
}
