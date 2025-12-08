package org.streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindElement {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(4,11,8,10,14);

        // Find first element satisfying the given condition
        Optional<Integer> findFirst = intList.stream()
                .filter(x -> x % 5 == 0)
                .findFirst();
        if(findFirst.isPresent()){
            System.out.println("Find first result = "+findFirst.get());
        } else {
            System.out.println("No element found for Find first");
        }

        //When no condition given it will return first element of Stream
        Optional<Integer> findFirstNoCondition = intList.stream()
                .findFirst();
        if(findFirstNoCondition.isPresent()){
            System.out.println("Find first result when No condition given = "+findFirstNoCondition.get());
        } else {
            System.out.println("No element found for Find First");
        }

        // Find Any with filter condition
        Optional<Integer> findAnyWithConditionInt = intList
                .stream()
                .filter(x->x%2!=0)
                .findAny();
        if(findAnyWithConditionInt.isPresent()){
            System.out.println("Find any result when condition given = "+findAnyWithConditionInt.get());
        } else {
            System.out.println("No element found for Find any with condition");
        }

        // Find Any with No filter condition
        Optional<Integer> findAnyInt = intList.stream().findAny();
        if(findAnyInt.isPresent()){
            System.out.println("Find any result when No condition given = "+findAnyInt.get());
        } else {
            System.out.println("No element found for Find any without condition");
        }
    }
}
