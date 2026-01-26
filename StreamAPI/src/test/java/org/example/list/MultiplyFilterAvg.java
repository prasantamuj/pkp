package org.example.list;
import java.util.Arrays;
import java.util.List;
public class MultiplyFilterAvg {

    public static void multiplyFilterAvg(List<Integer>ls){

       double d=  ls.stream().map(e->e*e).filter(e->e>100).
                mapToInt(e->Integer.valueOf(e)).average().getAsDouble();

        System.out.println(" The output of the problem is ::"+d);

    }

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(5,9,10,12,14,15,18,20,25);
        MultiplyFilterAvg.multiplyFilterAvg(ls);

    }
}
