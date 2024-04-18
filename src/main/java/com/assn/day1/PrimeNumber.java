package com.assn.day1;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean arm() {

        int num, temp, c = 0;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        temp = num;
        while (num != 0) {
            int d = num % 10;
            c += d * d * d;
            num /= 10;
        }
        if (temp == c) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        PrimeNumber.arm();
    }
}