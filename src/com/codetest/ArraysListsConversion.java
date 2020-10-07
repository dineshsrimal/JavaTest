package com.codetest;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dineshs on 9/12/2020.
 */
public class ArraysListsConversion {

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        int[] primitiveArr = {4, 5, 6};

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(5);
        intList.add(6);

        List<Integer> convertedArr = Arrays.asList(intArr);
        convertedArr = Arrays.stream(primitiveArr).boxed().collect(Collectors.toList());
        primitiveArr = Arrays.stream(intArr).mapToInt(t -> t).toArray();           // 1st method
        primitiveArr = Arrays.stream(intArr).mapToInt(Integer::intValue).toArray(); // 2st method
        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt) // converting String number to primitive int
                .max()
                .ifPresent(System.out::println);

        Stream.of("a1", "a2", "a3").map(String::toUpperCase).forEach(System.out :: println);

        Map<String, String> map = Stream.of("a,1", "b,2", "c,3").collect(Collectors.toMap(e -> e.split(",")[0], e -> e.split(",")[1]));
        map.forEach((k,v) -> System.out.println("Key: " + k + " Val: " + v));

        Integer[] convertedList = intList.toArray(new Integer[0]); // Just passed a 0 size array of the Type<T>


        System.out.println("converted...");
    }
}
