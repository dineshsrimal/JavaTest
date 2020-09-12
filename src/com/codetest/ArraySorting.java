package com.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by dineshs on 9/12/2020.
 */
public class ArraySorting {

    public static void main(String[] args) {
        Integer[] arrAsc = {1, 5, 8, 2, 7, 4, 9, 3};
        Integer[] arrDsc = {1, 5, 8, 2, 7, 4, 9, 3};
        /*List<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(7);*/

        Arrays.sort(arrAsc);
        System.out.println(Arrays.asList(arrAsc));

        Arrays.sort(arrDsc, Collections.reverseOrder());
        System.out.println(Arrays.asList(arrDsc));
    }
}
