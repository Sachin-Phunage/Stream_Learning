package org.streams.terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {

        // Collect stream elements into a set
        Stream<String> numbersStreamSet = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");
        Set<String> collectedSet = numbersStreamSet.collect(Collectors.toSet());
        System.out.println("Generated set :"+collectedSet);
        System.out.println();

        // Collect stream elements into a list
        Stream<String> numbersStreamList = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");
        List<String> generatedList = numbersStreamList.collect(Collectors.toList());
        System.out.println("Generated list :"+generatedList);
    }
}
