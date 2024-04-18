package com.topicwise;

import java.util.*;

public class TestScal {



    public static int evenMaxNumber(int[] A) {
        List<Integer> array = new LinkedList<>();
        List<Integer> oddArray = new LinkedList<>();
        int evenMax = Integer.MAX_VALUE;
        int oddMin = Integer.MIN_VALUE;
        int diff = evenMax - oddMin;
        int[] evenarr = new int[array.size()];
        int[] oddarr = new int[oddArray.size()];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                array.add(A[i]);
            }else {
                oddArray.add(A[i]);
            }
        }

        for (int i = 0; i < evenarr.length; i++) {
            for (int j = i + 1; i < evenarr.length; j++) {
                if (evenarr[i] > evenarr[j]) {
                    evenMax = evenarr[i];
                }
            }
        }

        for (int i = 0; i < oddarr.length; i++) {
            for (int j = i + 1; i < oddarr.length; j++) {
                if (oddarr[i] > oddarr[j]) {
                    evenMax = oddarr[i];
                }
            }
        }
        return diff;

    }

    public static int solvemax(int[] A) {
        int fmax = A[0];
        int smax = A[0];
        int n = A.length;

        for(int i=0;i<n;i++) {
            if(A[i] > fmax) {
                smax = fmax;
                fmax = A[i];
            }else if( A[i] > smax && A[i] != fmax ){
                smax = A[i];
            }
        }
        return smax;
    }

//    public static int[][] solveSub(int[] A) {
//
//        int[][] ans = new int[A.length][];
//
//        int n = A.length;
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//
//                for(int k = i; k<= j;k++){
//                    ans = A[k];
////                    return A[k];
//                }
//            }
//        }
//
//    }

    //count odd elemnt occurance in array
    static int countOdd(int []a){
        int n = a.length;
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j =i+1;j<n;j++){
                if( a[i] == a[j] ){
                   count++;
                }
            }
            if(count % 2 != 0){
                return count;
            }
        }
        return  -1;
    }

    public static long subarraySum(int[] A) {

        int n = A.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                for(int k=i;k<j;k++){
                    System.out.println(A[j] );
                }

            }
        }
    return 1;
    }


    public static ArrayList<ArrayList<Integer>> solveA(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();

        for(int s = 0; s < N; s++)
        {
            for(int e = s; e < N; e++)
            {
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = s; i <= e;i++)
                {
                    list.add(A.get(i));
                }
                subarrays.add(list);
            }
        }
//        subarrays.stream().map(number -> ArrayList<ArrayList<Integer>>).forEach(System.out::println);

//        subarrays.stream().flatMap(pList -> pList.stream() ).collect(Collectors.toList());

//        subarrays. values().stream().collect(Collectors.summingInt(Integer::intValue));
//        subarrays.stream().flatMap(Stre)
        System.out.println("<<<<<");
        System.out.println(subarrays);

        return subarrays;
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3 };

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(solveA((ArrayList<Integer>) list));

//        System.out.println(subarraySum(a));
//        System.out.println(countOdd(a));
//
//        System.out.println(solvemax(a));
//        int b[] = {3, 4};
//        int aa[] = {0,2,9};
//
//        System.out.println(evenMaxNumber(aa));
//
//        System.out.println("Array 1: "
//                + Arrays.toString(a));
//
//        System.out.println("Array 1: "
//                + Arrays.toString(b));
//
//        System.out.println(Arrays.toString(findCommonElement(a, b)));
    }

    public static int[] findCommonElement(int[] a, int[] b) {
        List<Integer> array = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int ele : a) {
            set.add(ele);
        }

        for (int ele : b) {
            if (set.contains(ele)) {
                array.add(ele);
            }
        }

        int[] arr = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arr[i] = array.get(i);
        }
        return arr;
    }

//
//    public int[] solve(int[] A, int[] B) {
//
//
//        ArrayList list = new ArrayList<>();
//
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; i < B.length; j++) {
//                if (A[i] == B[j]) {
//                    list.add(A[i]);
//                }
//            }
//        }
//        return list;
//    }

}
