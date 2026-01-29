package org.example.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Get2ndHigh {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(400,200,600,100,700,500,300,200);
        int Hig2nd = ls.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        int min2nd = ls.stream().sorted().limit(2).skip(1).findFirst().get();
        System.out.println(Hig2nd);
        System.out.println(min2nd);
    }
}
