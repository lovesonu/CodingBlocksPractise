package com.topicwise.community;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayExample {

    public static void main(String[] args) {

        int arr[] = {1, 9, 23, 3, 18, 22};
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));

        System.out.println(maxrange(arr, 1, 3));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(evenNumberCout(arr));
        System.out.println(evenNumberCountArray_digit(arr));
        System.out.println(containsDuplicate(nums));
    }

    //1,2,3,4

    public static boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }else {
                set.add(num);
            }
        }
        return false;
    }


    static int evenNumberCountArray_digit(int[] nums) {

        /*
        This for another way to solve
         */
        /*static int evenNumberCout_digit(int[] arr) {
            int count = 0, evencount = 0,rem = 0;
            for (int i = 0; i < arr.length; i++) {
                while (arr[i] > 0) {
                    rem = arr[i] % 10;
                    count++;
                    arr[i] /= 10;
                }
                if (count % 2 == 0) {
                    evencount++;
                }
            }
            return evencount;
        }*/

        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int number = digitCount(num);
        return number % 2 == 0;

    }

    static int digitCount(int num) {

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    static int evenNumberCout(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static void reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }

    static int maxrange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    private static int max(int[] arr) {
        int maxvalue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
