package com.gfg.array;

import java.util.*;
import java.util.stream.Collectors;

public class MidiumQn {

    // Minimum number of jumps
    int minJumps(int arr[], int n) {
        int jump = 1;
        int maxReach = arr[0];
        int i = 1;
        for (i = 1; i < arr.length - 1; i++) {
            maxReach = Math.max(maxReach, arr[i] + 1); // previus reach ,
        }
        return jump;
    }

    public int[] preorderTraversal(int A) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] r = new int[res.size()];

        for (int d : r) {


        }

        return r;
    }

    static StringBuilder test(StringBuilder sb, String s) {
        sb.append(s);
        char[] ch = new char[]
                {'f', 'o', 'r', 'G', 'e', 'e', 'k', 's', 'q', 'q'};
        sb.append(ch, 1, 9);

        return sb;
    }


    public static String swapString(String A) {

        if (A.length() < 2)
            return A;
//sonu
        char[] ch = A.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;
        return String.valueOf(ch);
    }

    public static boolean plaidrome(String A) {

        char[] ch = A.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (j >= 0) {
            if (ch[i] != ch[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    int isPalindrome(char[] ch, int s, int e) {
        if (s >= e)
            return 1;
        if (ch[s] != ch[e])
            return 0;
        return isPalindrome(ch, s + 1, e - 1);
    }

    public int solve(String A) {
        int res = isPalindrome(A.toCharArray(), 0, A.length() - 1);
        return res;
    }

    //incomplete the bellow code
    public static int solved(int A, int B) {

        int j = 1;
        int count = 0;
        for (int i = 0; i < A; i++) {
            int p = 1;
            if (B == p) {
                count++;

            }

            B = B * j;
        }
        return count;
    }

    public static int sumOfDigits(int n) {
        if (n <= 9) return n;
        return n % 10 + sumOfDigits(n / 10);
    }

    public static int solve(int A) {
        while (A > 9) {
            A = sumOfDigits(A);
        }
        if (A == 1) return 1;
        return 0;
    }

    static int fun(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return fun(x * x, n / 2);
        } else {
            return x * fun(x * x, (n - 1) / 2);
        }

    }

    static int subArrySum(int[] a, int b) {
        int evensum = 0;
        ArrayList<Integer> ar = subarryIn(a);
        System.out.println(ar.size());
        if ((ar.size() % 2 == 0 && ar.size() < b) || (ar.size() % 2 != 0 && ar.size() > b)) {
            evensum++;
        }
        return evensum;
    }

    static ArrayList<Integer> subarryIn(int[] a) {
        ArrayList<Integer> ar = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    ar.add(a[k]);
                }
            }
        }
        return ar;
    }

    static void digonalprint(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + mat[j][i];
            }
            System.out.println(" <<<<<<<<<<<" + sum);
        }

    }

    public static int subsolve(int[][] A, int[][] B) {
        int n = A.length;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] != B[i][j])
                    return 0;
            }
        }
        return 1;
    }

    static int minDiff(int[] a) {
        int n = a.length;
        int cur = 0;
        ArrayList<Integer> aa = new ArrayList<>();
        int pre = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                cur = a[i] - a[j];
                pre = cur;
            }
        }

        Collection<Integer> ssss = aa.stream().sorted().collect(Collectors.toList());
        return ssss.size();

    }

    public static int solvedd(int[] A) {
        int n = A.length - 1;
        int total_sum = 0;
        for (int i = 0; i < A.length; i++) {
            total_sum = total_sum + A[i];
        }
        Arrays.sort(A);
        int cost = 0;
        for (int i = n; i >= 0; i--) {
            cost += total_sum;
            total_sum = total_sum - A[i];
        }
        return cost;
    }

    public static int nobleIntegerDD(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1])
                continue;

            // In case of duplicates, we
            // reach last occurrence here.
            if (arr[i] == n - i - 1)
                return arr[i];
        }

        if (arr[n - 1] == 0)
            return arr[n - 1];

        return -1;
    }

    public int solve(int A, long B) {
        return helper(A).get((int) B);
    }


    ArrayList<Integer> helper(long a) {
        if (a == 1) {
            ArrayList<Integer> v = new ArrayList<Integer>();
            v.add(0);
            return v;
        }

        ArrayList<Integer> v1 = helper(a - 1);
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < v1.size(); i++) {
            if (v1.get(i) == 0) {
                v.add(0);
                v.add(1);
            } else {
                v.add(1);
                v.add(0);
            }
        }
        return v;
    }


    public static String longestPalindrome(String A) {
        int n = A.length();
        int maxLenght = 0;
        int i = 0;
        for (i = 0; i < n; i++) {
            int len = 0;
            for (int j = i; j < n; j++) {
                if (palindrome(A, i, j))
                    len = j - i + 1;
                maxLenght = Math.max(maxLenght, len);
            }
        }
        return A.substring(i, i + maxLenght);
    }

    static boolean palindrome(String s, int start, int end) {
        start = 0;
        end = s.length() - 1;
        while (start < end) {

            if (s.charAt(start) != s.charAt(end))
                return false;
        }
        return true;
    }

    public static int solve(int[] A) {
        int count = 0;
        int i, j;
        int n = A.length;
        int leftsum = 0;
        int rightsum = 0;

        //-7, 1, 5, 2, -4, 3, 0
        for (i = 0; i < n; ++i) {
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += A[j];
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += A[j];
            if (leftsum == rightsum)
                count++;
        }
        return count;
    }

    public static int solvec(String s) {

        char[] A = new char[s.length()];
        for (int i = 0; i < A.length; i++) {
            if ((A[i] >= 'A' && A[i] <= 'Z') && (A[i] >= '0' && A[i] <= '9') && (A[i] >= 'a' && A[i] <= 'z')) {
                return 1;
            }
        }
        return 0;
    }

    public static void dupli(int[] A) {
        int n = A.length;
//        int res[] = new int[n];
//1, 2, 3, 1, 2, 4
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j < n; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
                System.out.println("count of Number " + A[i] + " : " + count);
            }
//            System.out.println("count of Number " +A[i] + " : "+count);
        }
    }

    public ArrayList<Integer> duplicateEle(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        return res;

    }

    static boolean isPalindromes(String str) {
        int n = str.length();

        if (n == 0) {
            return true;
        }

        return isPalid(str, 0, n - 1);
    }

    static boolean isPalid(String str, int s, int e) {
        if (s == e) {
            return true;
        }

        if (str.charAt(s) != str.charAt(e)) {
            return false;
        }

        if (s < e + 1) {
            return isPalid(str, s + 1, e - 1);
        }
        return true;
    }


    static void rev(String str, int e) {
        if (e == str.length()) {
            return;
        }

        rev(str, e + 1);
        System.out.print(str.charAt(e));
    }

    static int addNumber(int n) {

        int sum = 0;
        if ( n <= 9 ){
            return n;
        }
        sum = n % 10;
            return sum + addNumber(n/10);
    }

    static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return a;
        }
        return a * pow(a, n-1);
    }

    public static void main(String[] args) {


        Hashtable<String, String> ab = new Hashtable<String, String>();
        String c=null;
        ab.put(c, "2");
        System.out.println(" : dgg "+ab);

        int[] a = {1, 2, 3, 1, 2, 4};
//        rev("sonu", 0);
        System.out.println(pow(3,0));
//        System.out.println(addNumber(466));

//        dupli(a);
//        System.out.println(isPalindromes("abaa"));
//        System.out.println(longestPalindrome("aaabaaa"));
//        System.out.println(nobleIntegerDD(a));
//        System.out.println(sortColo(a));
//        minDiff(a);
//        System.out.println(solvedd(a));
//        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] b = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(subsolve(mat,b));
//        digonalprint(mat);
        System.out.println("--------------------------------------------------------");
        StringBuilder sc = new StringBuilder("My day : ");
//        System.out.println(">>>>>>>>>."+test(sc,"Google"));
//        System.out.println(solve(83557));
//        int[] a = {1, 2, 3, 4, 5};
//        System.out.println(subArrySum(a, 4));
    }
}
