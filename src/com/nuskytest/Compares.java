package com.nuskytest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by dineshs on 9/27/2020.
 */
public class Compares {

    public static void main(String[] args) {
        String[] cilities = {"Bangalore", "Pune", "San Fransisco", "New York"};
        MySort mySort = new MySort();
        Arrays.sort(cilities, mySort);
        System.out.println(Arrays.binarySearch(cilities, "New York"));
    }
}

class MySort implements Comparator {

    public int compare(String a, String b) {
        return b.compareTo(b);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
