package org.example.list;

import java.util.*;
public class SumOfAllNumbers {

   public void sumOfAllNumbers( List<Integer> ls){

       Optional<Integer> sum = ls.stream().reduce((a, b) -> (a + b));
      System.out.println(" The Sum of the List is --> "+sum.get());
   }

    public static void main(String[] args) {
        SumOfAllNumbers sum = new SumOfAllNumbers();
        List<Integer> list = Arrays.asList(20,20,30,40,50, 60);
        sum.sumOfAllNumbers(list);

    }
}
