package com.topicwise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Concept {
    public static void main(String[] args) {
        String input = "ilovejavatech";
        //Count of occurance of char
        Map<String, Long> countMap = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        List<String> collect = countMap.entrySet().stream().filter(s -> s.getValue() > 1) //for finding uniq filter(s->s.getvalue() ==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        //find first non repeated element from string  //same code just add LinkHAsmp because List is not following
        // insertion order and linkhashmp use insertion
        String firstNonRepeated = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue() ==1)
                .findFirst().get().getKey();

        //Find second highest number
        int[] num = {5,9,11,2,8,21,1};
        List<Integer> secondLis =  Arrays.stream(num).boxed().sorted().collect(Collectors.toList());
        List<Integer> second =  Arrays.stream(num).boxed().sorted(Comparator.reverseOrder()).skip(2).collect(Collectors.toList());

        //Find longest string
        String[] strings = {"apple", "banana", "orange", "kiwi", "strawberry"};
        //Approch 1
        Optional<String> max = Arrays.stream(strings).max(Comparator.comparingInt(String::length));
        //Approch 2
        String longetsString = Arrays.stream(strings).reduce((word1,word2) -> word1.length() >word2.length() ? word1 : word2).get();

        //Find all elemnt from array who starts with 1
        int[] nums = {5,9,11,2,8,21,1};
        List<String> collect1 = Arrays.stream(nums).boxed().map(s -> s + "")
                .filter(s->s.startsWith("1"))
                .collect(Collectors.toList());

        //String.join method use
        List<String> listString = Arrays.asList("1","2","3","4","5");
        String res = String.join(",",listString); //Use of join to join string with any pattern String.join(string)

        //Use case of skip vs limit
        IntStream.rangeClosed(1,10)
                .skip(1)
                .limit(8)
                .forEach(System.out::println);
    }
}