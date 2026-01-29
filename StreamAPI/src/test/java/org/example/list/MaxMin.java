package org.example.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class MaxMin {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,5,6,20,11,25,12,15,30,24,14);
        int max = ls.stream().sorted().max(Comparator.comparing(Integer::valueOf)).get();
        int max2 = ls.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(max);
        System.out.println(max2);
        int min = ls.stream().sorted().min(Comparator.comparing(Integer::valueOf)).get();
        int min2 = ls.stream().sorted().findFirst().get();
        System.out.println(min);
        System.out.println(min2);
    }
}
