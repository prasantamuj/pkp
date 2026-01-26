package org.example.list;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AverageOfAllStream {

    public static void averageOfAllStream(List<Integer>ls){
       // Method One
        Optional<Integer> op = ls.stream().reduce((a, b)->a+b);
        int avg = op.get()/ls.size();
        System.out.println(avg);

        // Method 2

       double d =  ls.stream().mapToInt(e->Integer.valueOf(e)).average().getAsDouble();
       System.out.println(d);
    }

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(10,20,30,40,50,60);
        AverageOfAllStream.averageOfAllStream(values);

    }
}
