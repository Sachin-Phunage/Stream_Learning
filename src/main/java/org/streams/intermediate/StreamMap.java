package org.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {

     public static void main(String[] args) {

          // 1.Multiply each element of List by 5
          List<Integer> numberrList = Arrays.asList(1, 3, 5, 2, 7, 9, 12);
          System.out.println("Original List:"+numberrList);
          Stream<String> stringStream = numberrList.stream()
                  .map(x -> x * 5)
                  .map(String::valueOf);
          System.out.println("Modified List:"+ stringStream);
          System.out.println();

          // 2.Map String length in place of String
          List<String> wordsList = Arrays.asList("One", "two", "Three", "Four", "five", "six", "seven", "Eight");
          System.out.println("Words List:"+wordsList);
          List<Integer> lengthList = wordsList.stream()
                  .map(String::length)
                  .toList();
          System.out.println("Length of elements List:"+lengthList);
     }
}
