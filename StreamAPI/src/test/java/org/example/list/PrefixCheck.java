package org.example.list;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixCheck {


    public static void main(String[] args) {
         List<Integer> ls = Arrays.asList(10,20,24,28, 30,40,50);
         List<Integer>finalValue = ls.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
                .map(e->Integer.valueOf(e)).collect(Collectors.toList());
         System.out.println("The output of the program is ::==> "+finalValue);
    }
}
