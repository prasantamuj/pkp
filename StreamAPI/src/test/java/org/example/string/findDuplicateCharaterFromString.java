package org.example.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findDuplicateCharaterFromString {

    public static void main(String[] args) {
        String P = "Prasanta kumar paul";
        List<Character> ch = new ArrayList<>();
        for(char c : P.toCharArray()){
            ch.add(c);
        }
        Map<Character,Long> map = ch.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(map);
        map.entrySet().stream().filter(e->e.getValue()>1).
                forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
    }
}
