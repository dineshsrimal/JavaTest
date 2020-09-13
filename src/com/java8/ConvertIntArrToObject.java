package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by dineshs on 9/13/2020.
 */
public class ConvertIntArrToObject {

    public static void main(String[] args) {
        int[] intArr = {1,6,7,3,5,9};

        Integer[] intObjArr = Arrays.stream(intArr).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println("");
    }
}
