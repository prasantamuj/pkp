package org.example.list;

import java.util.Arrays;

public class AllZeroLeft {

    public static void main(String[] args) {
        int[] num = {0, 2, 7, 0, 4, 0, 7, 0, 6, 0};
        System.out.println(num);
        Arrays.sort(num);
        Arrays.stream(num).forEach(e -> System.out.print(e));
        System.out.println("----------------------------------");
        // With out using the arrays.shot

        int[] num1 = {0, 2, 7, 0, 4, 0, 8, 0, 6, 0};
        int len = num1.length;
        int pos = len - 1;

        for (int i = pos; i >= 0; i--) {
            if (num1[i] != 0) {
                num1[pos] = num1[i];
                pos--;
            }
        }
        while (pos >= 0) {
            num1[pos] = 0;
            pos--;
        }
        Arrays.stream(num1).forEach(System.out::print);

    }
}
