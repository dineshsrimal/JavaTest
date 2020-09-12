package com.codetest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dineshs on 9/12/2020.
 */
public class ArraysListsConversion {

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(5);
        intList.add(6);

        List<Integer> convertedArr = Arrays.asList(intArr);

        Integer[] convertedList = intList.toArray(new Integer[0]); // Just passed a 0 size array of the Type<T>


        System.out.println("converted...");
    }
}
