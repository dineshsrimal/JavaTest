package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dineshs on 9/13/2020.
 */
public class ConvertIntArrToPremitive {

    public static void main(String[] args) {

        Integer[] intObjArr = {1, 4, 7, 6,5, 3};
        int[] intArr = Arrays.stream(intObjArr).mapToInt(n -> n + 1).toArray();

        //Convert array to list
        List<Integer> integerList = Arrays.asList(intObjArr);

        //Convert List to array
        Integer[] intObjArr2 = integerList.toArray(new Integer[0]);


    }
}
