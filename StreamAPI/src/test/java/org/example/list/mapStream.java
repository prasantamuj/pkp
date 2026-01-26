package org.example.list;
import java.util.stream.*;
public class mapStream {
    //Using Stream map(Function mapper) to
    //convert the Strings in stream to
    //UpperCase form

    public static void main(String[] args) {
        Stream<Integer> streamInt = Stream.of(3,4,5,6,7,8,9);
        Stream<String> streamString = Stream.of("vivaan", "dhrub","sonu","lalita");
        Stream<String> streamString2 = Stream.of("vivaan", "dhrub","sonu","lalita");
        streamInt.map(i-> i*4).forEach(e-> System.out.println(e));
        streamString.map(str->str.toUpperCase()).forEach(System.out::println);
        streamString2.map(str->str.length()).sorted((a,b)->a-b).forEach(System.out::println);
    }
}
