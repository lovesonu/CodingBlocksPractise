package com.assn.day1;

public class Assignment1 {

    public static void test() {
        int n = 5;
        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void a1q1() {
        // print reverse number
 /*               1
          2     3      2
    3     4     5      4   3
 4  5     6     7      6   5    4
  */


        int n = 4;
        int row = 1;
        while (row <= n) {
            int space = 1;
            while (space <= n - row) {
                System.out.print(" ");
                space = space + 1;
            }
            int col = 1;
            int p = row;
            while (p <= row) {
                System.out.print(p);
                p = p + 1;
                col = col - 1;
            }
            while (col <= 2 * row - 1) {
                if (col <= row) {
                    p++;
                    System.out.print(p);
                } else {
                    p = p - 1;
                    System.out.print(p);
                }
                col = col + 1;

            }
            System.out.println();
            row++;
        }


    }

    public static void q2() {
        // print reverse number

        int n = 1436;
        int rev = 0, rem;
        while (n != 0) {

            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println(rev);
    }


    public static void q3() {

        //for print fibbo series
        int t1 = 0, t2 = 1, n = 6, i = 1;
        while (i <= n) {

            //System.out.print(t1 + " , ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;

            i++;
        }
        System.out.println(t1);

    }


    public static void manmohanPattern() {
        /*
        1
        11
        202
        3003
        40004

        */

        int n = 5;
        int row = 0;

        while (row < n) {

            int col = 0;
            while (col <= row) {
                if(row <= 1)
                {
                    System.out.print(1);
                } else if(col == row || col <1) {

                        System.out.print(row);
                    }
                else {
                        System.out.print(0);
                    }

                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void main(String[] args) {
//        q3();
//        a1q1();
//        test();
//        manmohanPattern();
    }

}
