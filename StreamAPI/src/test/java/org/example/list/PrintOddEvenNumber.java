package org.example.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddEvenNumber {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10,19,27,21,22,24,25,26,27,29);
        List<Integer> even = ls.stream().filter(e->e%2==0).collect(Collectors.toList());
        List<Integer> odd = ls.stream().filter(e->e%2!=0).collect(Collectors.toList());
        System.out.println("The even list -->"+ even);
        System.out.println("The odd list -->"+ odd);
    }
}
