package org.streams;

import java.util.*;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamCreateExample {

    public static void main(String[] args) {

        // 1.Creating a Stream from a Collection
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
        // 2.Stream of specified values

        Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5);
        intStream.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 3.Creating a Stream from an Array
        String [] strArray = new String[] {"A", "B", "C", "D"};

        Stream<String> strArrayStream = Arrays.stream(strArray);
        strArrayStream.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        String [] strArray1 = new String[] {"A1", "B1", "C1", "D1"};
        Stream<String> strArrayStream2 = Stream.of(strArray1);
        strArrayStream2.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 4.Creating a Stream empty Stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 5.Creating a Stream using Stream builder

        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> streamBuild = streamBuilder.add("One").add("Two").add("Three").add("Four").build();
        streamBuild.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 6.Creating an Infinite stream

        int startValue = 2 , limitCount=5;

        Stream.iterate(startValue,(Integer n) -> n * 2)
                .limit(limitCount)
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 7.Creating stream using generate
        Stream.generate(new Supplier<Integer>() {
                    private int n = 1;
                    @Override
                    public Integer get() {
                        int square = n * n;
                        n++;
                        return square;
                    }
                })
                .limit(limitCount)
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 8.Create stream from a Pattern using Predicate
        List<String> strList = Arrays.asList("Group","Goat","Goal","Football","Cricket","Gmail");
        Pattern pattern = Pattern.compile("^G");
        strList.stream()
               .filter(pattern.asPredicate())
               .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 9.Create stream from Iterator

        Iterator<String> iterator = Arrays.asList("One","Two","Three","Four").iterator();
        Spliterator<String> stringSpliterator = Spliterators.spliteratorUnknownSize(iterator, Spliterator.NONNULL);
        Stream<String> streamNew = StreamSupport.stream(stringSpliterator, false);
        streamNew.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");

        // 10.Create stream from Iterable

        Iterable<String> strIterable
                = Arrays.asList("a", "b", "c","d","e","f","g");
        Stream<String> iterableStream = StreamSupport.stream(strIterable.spliterator(), false);
        iterableStream.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------------");
    }
}
