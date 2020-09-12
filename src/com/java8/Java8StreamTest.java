package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by dineshs on 9/12/2020.
 */
public class Java8StreamTest {

    public static void main(String[] args) {

        //---- use Stream.filer method with  Predicate and Lambda
        List<String> cities = Arrays.asList("New York", "Tokyo", "New Delhi", "Queenstown");


        Stream<String> citiStream = cities.stream().filter(str -> str.length() > 6).filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("Q");
            }
        });

        System.out.println(Arrays.toString(citiStream.toArray()));

        //----- convert primitive array to Integer obj array
        int[] intArr = {1, 4, 7, 3, 9, 5, 8};
        List<Integer> intStream = Arrays.stream(intArr).boxed().collect(Collectors.toList());

        System.out.println(Arrays.toString(intStream.toArray()));

    }
}
