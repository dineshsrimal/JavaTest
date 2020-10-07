package com.java8;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> longStr = Stream.of("Hello", "Dog", "Flower").filter(s -> s.length() > 5).findAny();
        String matchingVal = longStr.orElse("No match");
        System.out.println("Value Present: " + longStr.isPresent() + ", Matching Val: " +matchingVal);
    }

}
