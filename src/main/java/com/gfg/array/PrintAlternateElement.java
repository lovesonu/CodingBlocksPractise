package com.gfg.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintAlternateElement {


    class Pair {
        long min;
        long max;

        public Pair(long min, long max) {
            this.min = min;
            this.max = max;
        }
    }

    //Print alternate element
    public static void print(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }


    //Value equal to index value
    static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> arrInt = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                arrInt.add(arr[i]);
            }
        }
        return arrInt;
    }

    //series sum 1- 100
    long seriesSum(int n) {

        Long N = Long.valueOf(n);
        if (N <= 0) {
            return 0;
        }
        long sum = N * (N + 1) / 2;
        return sum;
    }


//    N = 4
//    A[] = {1,2,3,2}
//    x = 1, y = 2
//    Output: 1


    static void getMinMax(long a[], long n) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        Arrays.sort(a);
        System.out.println("min = " + a[0]);


        System.out.println("max = " + a[(int) n]);
    }

    //Minimum distance between two numbers
    static int minDist(int a[], int n, int x, int y) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x <= a[0] && y > a[n - 1]) {
                count = y - x;
            } else {
                return -1;
            }
        }
        return count;
    }

    //Second Largest
    static int print2largest(int arr[], int n) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];

            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
            if (secondMax == Integer.MIN_VALUE) {
                return secondMax;
            }
        }
        return -1;
    }

    static int MissingNumber(int arr[], int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }

        int sum2 = 0;
        sum2 = (n * (n + 1) / 2);
        int diff = sum2 - sum;
        System.out.println(sum);
        System.out.println(sum2);
        return diff;
    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {

//        1,2,3,4,5

        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                max = arr[j];
                result.add(max);
            }
        }
        return result;
    }


    static boolean reve(int arr[], int index) {

        if (index == arr.length - 1) {
            return true;
        }

        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return reve(arr, index + 1);


//        if( n > 0){
//            reve(n-1);
//            System.out.println(n);
//            return true;
//
//            }else {
//            return false;
//        }
    }


    static void pattern(int n) {
        for (int i = n; i < 0; i--) {
            System.out.println("* ");
        }
    }


    static int[] kLargest(int[] arr, int n, int k) {

        Arrays.sort(arr);
        int temp[] = new int[k];
        int i = 0;
        int j = n - 1;
        while (k-- > 0) {
            temp[i] = arr[j];
            i++;
            j--;
        }
        return temp;
    }


    public static long kthElement(int a[], int b[], int n, int m, int k) {

        int t = n + m;
        int[] c = new int[t];

        for (int i = 0; i < t; i++) {
            if (i < n) {
                c[i] = a[i];
            } else {
                c[i] = b[i - n];
            }

            Arrays.sort(c);
        }
        System.out.println(Arrays.toString(c));
        System.out.println(c[k - 1]);

        return c[k - 1];
    }

    public static void sort012(int a[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static ArrayList<Long> findNumber(long arr[], int n, int x) {

        ArrayList<Long> currList = new ArrayList<>();
        ArrayList<Long> resList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                currList.add((long) i);
            }
        }

        return currList;
    }


    class pair {
        long first, second;

        public pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }
//
//    static void getMinMax(int arr[], int n) {
//        int min = 0;
//        int max = 0;
//        //1, 234,  21, 56789,345,567899
//        for (int i = 0; i < n; i++) {
//                if (arr[i] ) {
//                    min =  arr[i];
//                }
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//
//        }
//        System.out.println(min);
//        System.out.println(max);
//
//    }

    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        long f = 0;
        long s = 0;
        for(int i=0;i<n;n++){
            if(arr[i] > arr[i+1]){
                f = arr[i];
            }
        }

        for(int j=0;j<m;n++){
            if(arr[j] < arr[j+1]){
                s = arr[j];
            }

        }
        return f*s;
    }



    public static void main(String[] args) {
//        pattern(5);

        int b[] = {5,7,9,3,6,2};
        int c[] = {1,2,6,-1,0,9};

        System.out.println(find_multiplication(b,c,7,7));

        int arr1[] = {3, 2, 1, 56, 10000, 167};
//        getMinMax(arr1,arr1.length);
//        System.out.println(reve(arr1,0));
        Scanner sc = new Scanner(System.in);

        int n = 42;
//        System.out.println(">>>>>> Enter array element");

        int arr[] = {642, 642, 642};
        long a[] = {7, -2, 3, 4, 9, -1};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        System.out.println("<<<<<<<<<<<< out");

//        print(arr, n);
//        System.out.println(valueEqualToIndex(arr, n));

//        System.out.println(print2largest(arr,n));

        int A[] = {1, 2, 2, 2, 5};
//        System.out.println(minDist(A,10,1,2));
        long a1[] = {3, 2, 1, 56, 10000, 167};
//        getMinMax(a1,7);
//        System.out.println(MissingNumber(A,5));

//        System.out.println(max_of_subarrays(A,5,3));

//        System.out.println(kLargest(A,10,2));


        int[] a22 = {90, 20, 30, 40};
        // second array
        int[] b22 = {500, 60, 70, 80};

//        kthElement(a22,b22,4,4,2);

//        sort012(a22,5);
        long v[] = {1, 2, 2, 2, 5};
//        findNumber(v, 7, 2);
    }
}

