package org.example.list;



import java.util.*;
import java.util.stream.Collectors;
import java.util.Map;
public class CheckFrequency {

    public static void main(String[] args) {
        List<Character> ch = Arrays.asList('c','d','e','f','c','d','e','f','c','d','e','f','g');
        Set<Character> ch2= ch.stream().filter
                (e-> Collections.frequency(ch,e) > 1)
                .collect(Collectors.toSet());
        System.out.println(ch2);

        Map<Character,Long> map1 = ch.stream().
                collect(Collectors. groupingBy (c->c,Collectors.counting()));
        System.out.println(map1);
    }
}
