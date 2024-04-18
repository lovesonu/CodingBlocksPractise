package com.assn.day1;

public class rowTest {

    public static void main(String args[]) {
        /*int[][] a = {
                {1,2,3,10},
                {4,5,6,20},
                {7,8,9,30},
                {60,70,80,90}
        };*/

        int a[][] = {{1, 2, 3, 4,20}
                    ,{5, 6, 7, 8,30}
                    ,{9, 10, 11, 12,40}
                    ,{13, 14, 15, 16,50},
                     {60, 70, 80, 90,100}
        };
        int k = 0;
        int n =5;
        while (k <= 2*n-1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if ((i + j) == k)
                        System.out.print(a[i][j] + " ");
                }
            }
            k = k + 1;
        }
    }
}
