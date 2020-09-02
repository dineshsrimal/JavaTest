package com.codetest;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] tempArray = new int[3];

        System.arraycopy(array, 3, tempArray, 0, 2);
        System.out.println("Original Array : " + Arrays.toString(array));
        System.out.println("Array Copy : " + Arrays.toString(tempArray));
    }
}
