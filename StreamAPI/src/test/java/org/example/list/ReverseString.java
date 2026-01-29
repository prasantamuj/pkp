package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
         String X = " This IS Infosys Interview ";
         char [] ch = X.toCharArray();
         List<Character> ch1 = new ArrayList<>();
         for(char c : ch){
             ch1.add(c);
         }

        Collections.reverse(ch1);
         System.out.println(ch1);
         String rev="";
         for(int i = ch.length-1; i>0;i--){
              rev += X.charAt(i);
         }
        System.out.println(rev);

        String [] st = X.split(" ");
        for(int j=st.length-1; j>0;j--){
            System.out.print(st[j]+ " ");
        }
    }


}
