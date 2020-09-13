package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dineshs on 9/12/2020.
 */
public class SecondHighest {

    public static void main(String[] args) {
        int[] arr = {14, 46, 47, 45, 92, 52, 48, 36, 66, 85};

        System.out.println("Second High....: " + findSecondHigh(arr));
    }

    public static int findSecondHigh(int[] arr) {

        List<Integer> intObjArr = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> sortedList = intObjArr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        //----Method 2 using Lambda as a Comparator

        List<Integer> sortedList2 = intObjArr.stream().sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        //return sortedList.get(1);
        return sortedList2.get(1);
    }
}
