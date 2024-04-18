package com.assn.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment4 {

    // Arrays
    //Binary search


    public static int a4q1(int[] n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n.length; i++) {
            int nums = n[i];
        }
        //Finding  max

        Arrays.sort(n);
        System.out.println(n[n.length - 1]);

        int max = n[0];

        // max update
        for (int i = 0; i < n.length; i++) {

            if (n[i] > max) {
                max = n[i];
            }
        }

        return max;
    }

    public static int a4q5_inverse(int n) {
        //inverse
        int counter = 0;
        int rem = 0;
        int sum = 0;

        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            counter++;

            sum = sum + counter * fact(rem);

        }
        return sum;
    }

    public static int fact(int rem) {
        int k = 1;
        while (rem > 1) {
            k = k * 10;
            rem--;
        }
        return k;
    }


    public static int a4q3_searchReturnIndex(int n[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < n.length; i++) {
            if (n[i] == m) {
                return i;
            }
        }
        return -1;
    }


    public static void a4q4_reverseArray() {


        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = n.length - 1; i >= 0; --i) {
            System.out.print(n[i]);

        }
    }

    public void swap(int start, int end) {

    }


    public static void main(String[] args) {
        a4q4_reverseArray();

int[] n = new int[10];
//        a4q2_searchReturn(n);
//        System.out.println(a4q2_searchReturn());
        /*
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
*/

        //
//        max(n);
//        System.out.println(" >" + max(n));

        int p = 32145;
//        a4q2(p);
    }
}
