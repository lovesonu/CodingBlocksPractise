package com.interview23;

import java.util.*;
import java.util.stream.Collectors;

public class InterTest {

    //find frequency using java 8
    void frequency() {
        List<Integer> list = Arrays.asList(1, 3, 2, 4, 4, 2, 5, 3, 3);
        // we can also use Function.identity() instead of c->c

        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("_____________________________________________________________________ ");
        //using frequncy method
        //first add in hashset
        Set<Integer> set = new HashSet<Integer>(list);
        for (Integer r : set) {
            System.out.println(r + ": " + Collections.frequency(list, r));
        }
    }

    static int findLongestRepeatingSubSeq(String str) {
//      str = "axxxy"
        int count =0;int ans = 0;
        for(int i=1;i<str.length();i++){

            if (str.charAt(i) == str.charAt(i - 1)){
                count++;
            }else {
                ans = Math.max(ans,count);
                count=1;
            }

        }
        ans = Math.max(ans,count);
        return ans;
    }

    public static void main(String[] args) {
        InterTest i1 = new InterTest();
//        i1.frequency();
        System.out.println(i1.findLongestRepeatingSubSeq("sssrtppppp"));
    }
}
