package org.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDistinct {
    public static void main(String[] args) {

        // 1.Print Distinct element of Stream
        List<Integer> numberList = Arrays.asList(1, 3, 4, 22, 1, 5, 7, 88, 90, 22, 11, 88);
        System.out.println("Original List :"+numberList);
        System.out.println("Distinct Elements List: "+numberList.stream().distinct().toList());
        System.out.println();

        IntStream intStream = IntStream.of(1, 3, 4, 22, 1, 5, 7, 88, 90, 22, 11, 88);
        System.out.println("Distinct intStream :"+intStream.distinct().boxed().toList());
    }
}
