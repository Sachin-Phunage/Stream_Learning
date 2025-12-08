package org.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindElement {
    public static void main(String[] args) {

        // FInd first element satisfying the given condition
        List<Integer> intList = Arrays.asList(4,11,8,10,14);
        Optional<Integer> findFirst = intList.stream()
                .filter(x -> x % 5 == 0)
                .findFirst();
        if(findFirst.isPresent()){
            System.out.println("Find first result = "+findFirst.get());
        } else {
            System.out.println("No element found");
        }

        //When no condition given it will return first element of Stream
        Optional<Integer> findFirstNoCondition = intList.stream()
                .findFirst();
        if(findFirstNoCondition.isPresent()){
            System.out.println("Find first result when No condition given = "+findFirstNoCondition.get());
        } else {
            System.out.println("No element found");
        }
    }
}
