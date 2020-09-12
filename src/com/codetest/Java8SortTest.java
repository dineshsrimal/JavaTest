package com.codetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by dineshs on 9/12/2020.
 */
public class Java8SortTest {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10));
        studentList.add(new Student(17));
        studentList.add(new Student(8));
        studentList.add(new Student(12));

        Stream<Student> stdStream = studentList.stream();
        Stream<Student> sortedStream = stdStream.sorted(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });

        System.out.println(Arrays.toString(sortedStream.toArray()));

    }
}


