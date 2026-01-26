package org.example.list;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class DuplicateElementFind {
    public static void main(String[] args) {
        // Method 1.
        List<Integer> ls = Arrays.asList(11,23,1,2,3,4,5,6,5,4,7,8,6,7,8,9,0,2,0);
        List<Integer> finaloutput = ls.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("The Distinct element was --> "+finaloutput);

        // method 2

        TreeSet<Integer> ts = new TreeSet<>(ls);
        System.out.println("The Distinct element was --> "+ts);
    }
}
