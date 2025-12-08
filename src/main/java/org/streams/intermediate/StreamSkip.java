package org.streams.intermediate;

import java.util.Arrays;
import java.util.List;

public class StreamSkip {
    public static void main(String[] args) {

        // Skip first 3 elements from stream
        int skipElements=3;
        List<String> wordsList = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");
        System.out.println("Original List : "+wordsList);
        System.out.println("List after skipping first "+skipElements+" elements : "+wordsList.stream().skip(skipElements).toList());
    }
}
