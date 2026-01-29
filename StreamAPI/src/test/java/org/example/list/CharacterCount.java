package org.example.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {

    public static void main(String[] args) {

        String x = " This is Infosys Interview";
        List<Character> ls = new ArrayList<>();
        for(char c :x.toCharArray()){
            ls.add(c);
        }
        System.out.println(ls);
        Map<Character,Long> map1 = ls.stream().collect(Collectors.
                groupingBy(c->c,Collectors.counting()));
        System.out.println(map1);
    }
}
