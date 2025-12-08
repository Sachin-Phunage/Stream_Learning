package org.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {

        //Filter numbers divisible by 5

        List<Integer> numberList = Arrays.asList(1, 5, 10, 17, 15, 25, 60, 40, 112, 57, 80, 19);
        System.out.println("Original List : ");
        numberList.forEach(System.out::println);

        System.out.println("Filtered List : ");
        numberList.stream()
                  .filter(x->x%5==0)
                  .forEach(System.out::println);
        System.out.println();

        // Filter the words starting with an Uppercase letter

        List<String> wordsList = Arrays.asList("One", "two", "Three", "Four", "five", "six", "seven", "Eight");
        System.out.println("Original List::"+String.join(",",wordsList));

        String filteredList = wordsList.stream().filter(str -> Character.isUpperCase(str.charAt(0)))
                .collect(Collectors.joining(", "));
        System.out.println("Filtered List:"+filteredList);

    }
}
