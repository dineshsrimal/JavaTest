package com.java8;

import java.util.Arrays;

/**
 * Created by dineshs on 9/12/2020.
 */
public class SumMultiOfThree {

    public static void main(String[] args) {

        System.out.println("Sum for range 1...9: " + sumMultiOfThreeForRange(1, 9));
        System.out.println("Sum for range 1...30: " + sumMultiOfThreeForRange(1, 30));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Sum for range array: " + sumMultiOfThree(arr));
    }

    public static int sumMultiOfThreeForRange(int lowerBound, int upperBound) {
        int sum = 0;

        for(int i = lowerBound; i <= upperBound; i++) {

            if(i % 3 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int sumMultiOfThree(int[] arr) {
        int sum = 0;

        sum = Arrays.stream(arr).boxed().filter(n -> n % 3 == 0).mapToInt(n -> n.intValue()).sum();

        return sum;
    }
}
