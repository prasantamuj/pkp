package org.example.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {

    public static void main(String[] args) {


    String x = " I love java ";

    String [] inputone = x.split(" ");
    String rev = "";

    for(int i=inputone.length-1; i>=0; i-- ){
        rev = rev+ inputone[i] + " ";
    }
    System.out.print(rev);

        String y = " I love python programming ";

        List<String> ls = Arrays.asList(y.split(" "));
        Collections.reverse(ls);
        String rev1 = ls.stream().collect(Collectors.joining(" "));
        System.out.println(rev1);



    }
}
