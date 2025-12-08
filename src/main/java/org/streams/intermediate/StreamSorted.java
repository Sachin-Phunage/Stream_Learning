package org.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {

        // 1. Sort the list of number
        List<Integer> numberrList = Arrays.asList(9, 3, 12, 2, 7,1, 5);
        System.out.println("Original List:"+numberrList);
        System.out.println("Sorted List:"+numberrList.stream().sorted().toList());

        // 2.Sort the list of String
        List<String> sortedList = Stream.of("Two", "One").sorted().toList();
        System.out.println("Sorted List:"+sortedList);
    }
}
