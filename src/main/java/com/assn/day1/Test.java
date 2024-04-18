package com.assn.day1;

import java.util.Scanner;

public class Test {


    public static void rhombusPatern() {

        int n = 5;
        int row = 5;
        int space = 5;

        while (row >=0) {
            int col = 0;

            while (col <= n) {

                if (col != row) {

                    System.out.print(" ");
                    if(col == row+2){
                        System.out.print("*");
                    }


                } else {
                    System.out.print("*");
                }
                col++;
            }

            System.out.println();
            row--;
        }

    }

    public static void main(String[] args) {


        rhombusPatern();


      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;

        while (row < n) {

            int col = 1;
            int k = 1;
            while (col <= n) {

                if (k <= col)
                    System.out.print(k);
                else
                    System.out.print("*");
                k++;
                col++;
            }


            System.out.println();
            row++;
        }
*/
    }
}

/*

if(row == 1)
        System.out.print(row);
        else
        System.out.print("*");*/
