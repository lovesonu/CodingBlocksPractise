package com.assn.day1;

public class Assignment6 {

    public static void q1EvenOdd(int n) {

        if (n == 0) {
            return;
        }

        if (n % 2 != 0) {

            System.out.println(">> odd " + n);

        }

        q1EvenOdd(n - 1);
        if (n % 2 == 0) {
            System.out.println("even  >> " + n);
        }

    }

    public static int q5Triangle(int n) {
        if (n < 0) {
            return 0;
        }


//        int res = n + q5Triangle(n-1);

        return n + q5Triangle(n-1);

    }


    public static void main(String[] args) {
//        q1EvenOdd(6);
        System.out.println(q5Triangle(5));
    }
}
