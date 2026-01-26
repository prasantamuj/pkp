package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class filterStream {

    public static void main(String[] args) {
        // Getting a stream consisting of the
        // elements that are divisible by 5
        //  Using Stream filter(Predicate predicate)
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        list.stream().filter(num -> num%5 ==0).forEach(num->System.out.println(num));
        Stream<String> stream = Stream.of(
                "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
        stream.filter(str->str.startsWith("G")).forEach(System.out::println);
        Stream<String> stream1 = Stream.of("Vivaan","Dhrub","Sonu");
        stream1.filter(str->str.endsWith("n")).forEach(System.out::println);
    }
}
