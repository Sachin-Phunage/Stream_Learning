package org.streams.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamCount {
    public static void main(String[] args) {

        // Count number of elements in List
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        long elementCount = numberList.stream().count();
        System.out.println("Number of elements in stream are : "+elementCount);

        //Count number of Distinct elements in list
        List<Integer> newNumberList = Arrays.asList(1,4,2,8,1,2,7,5,3,8,3,6,3);
        System.out.println("Total elements in are :"+newNumberList.size());
        long distinctElementCOunt = newNumberList.stream().distinct().count();
        System.out.println("Number of distinct elements in stream are : "+distinctElementCOunt);

    }
}
