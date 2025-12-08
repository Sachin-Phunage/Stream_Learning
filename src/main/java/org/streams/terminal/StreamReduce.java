package org.streams.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {

        // Calculate Sum of all numbers
        IntStream intStreamSum = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
        OptionalInt sumOfAllNumber = intStreamSum.reduce(Integer::sum);
        sumOfAllNumber.ifPresent(val -> System.out.println("Sum of all numbers ::"+ sumOfAllNumber.getAsInt()));
        System.out.println();

        // Calculate sum of all odd numbers
        IntStream intStreamAverage = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8);
        OptionalInt sumOfOddNumbers = intStreamAverage.filter(x -> x % 2 != 0).reduce(Integer::sum);
        sumOfOddNumbers.ifPresent(val -> System.out.println("sum of odd numbers :: "+sumOfOddNumbers.getAsInt()));
        System.out.println();
    }
}
