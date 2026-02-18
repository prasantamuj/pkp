package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int i=0; int j=0; int max=0;
        Set<Character> charSet = new HashSet<>();
        while(i<s.length()){
            if(!charSet.contains(s.charAt(i))){
                charSet.add(s.charAt(i));
                System.out.println(charSet);
                i++;
                max = Math.max(max,charSet.size());
            }else{
                charSet.remove(s.charAt(j));
                j++;
            }
        }
        System.out.println(max);
        charSet.stream().forEach(System.out::println);

    }
}
