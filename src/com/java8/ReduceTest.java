package com.java8;

import java.util.function.Function;
import java.util.stream.IntStream;

public class ReduceTest {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 3).reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("Sum: " + sum);
    }
}
