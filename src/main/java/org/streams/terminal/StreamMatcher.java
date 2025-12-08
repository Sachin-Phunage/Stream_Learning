package org.streams.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamMatcher {
    public static void main(String[] args) {

        // Check if the equation result is 5 for any element of this stream
        List<Integer> intList = Arrays.asList(3,4,6,12,20,24);
        boolean result = intList.stream().anyMatch(n -> (n * (n + 1)) / 4 == 5);
        System.out.println("Any Result :: "+result);
        System.out.println();

        boolean allMatchResult = intList.stream().allMatch(n -> (n * (n + 1)) / 4 == 5);
        System.out.println("All Match Result :: "+allMatchResult);
        System.out.println();

        boolean noneMatchResult = intList.stream().allMatch(n -> (n * (n + 1)) / 4 == 10);
        System.out.println("None Match Result :: "+noneMatchResult);
        System.out.println();

        //check whether any element in list having UpperCase at 1st index.
        List<String> wordsList = Arrays.asList("One", "two", "Three", "Four", "five", "six", "seven", "Eight");
        System.out.println("Original List::"+String.join(",",wordsList));
        boolean  isPresent = wordsList.stream().anyMatch(str -> Character.isUpperCase(str.charAt(0)));
        System.out.println("isPresent :: "+isPresent);



    }
}
