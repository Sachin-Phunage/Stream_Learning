package org.streams.terminal;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {

        // Traverse and print the stream content
        LongStream longStream = LongStream.range(4L, 14L);
        longStream.forEach(System.out::println);
        System.out.println();

        //In case of parallel stream, LongStream forEach does not guarantee to respect the order of the stream
        LongStream parallelLongStream = LongStream.range(4L, 14L);
        parallelLongStream.parallel().forEach(System.out::println);
        System.out.println();

        // Print all elements of a stream
        Stream<String> wordStream = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight");
        wordStream.forEach(System.out::println);
    }
}
