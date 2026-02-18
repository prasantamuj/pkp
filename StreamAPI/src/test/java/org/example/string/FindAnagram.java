package org.example.string;

import java.util.Arrays;

public class FindAnagram {

    //$O(n \log n)$
    public static void main(String[] args) {
        String x = "TEEM";
        String y = "MEET";
        char[] ch1 = x.toCharArray();
        char[] ch2 = y.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Both are Anagram");
        }else{
            System.out.println("Both are Not Anagram");
        }
    }
}
