package org.example.string;

public class FindMissingNumber {

    // Complexity$O(n)$
    public static void main(String[] args) {
        int [] array = {1,2,3,5};
        int n = array.length + 1;
        int expectedResult = (n*(n+1))/2;
        System.out.println("The Expected result is "+expectedResult);
        int actualResult =0;
        for (int p : array){
            actualResult+=p;
        }
        System.out.println("The Expected result is "+actualResult);
        System.out.println("The Missing number is "+(expectedResult-actualResult));
    }
}
