package com.codetest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dineshs on 9/12/2020.
 */
public class SortingWithComparator {


    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(10));
        customerList.add(new Customer(17));
        customerList.add(new Customer(8));
        customerList.add(new Customer(12));

        Collections.sort(customerList);
        System.out.println(customerList);


        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(10));
        studentList.add(new Student(17));
        studentList.add(new Student(8));
        studentList.add(new Student(12));

        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student std1, Student std2) {
                return std1.age.compareTo(std2.age); // ascending
                //return std2.age.compareTo(std1.age); // descending
            }
        });

        System.out.println(studentList);
    }
}

class Customer implements Comparable<Customer> {
    Integer age;

    public Customer(int custAge) {
        this.age = custAge;
    }

    @Override
    public int compareTo(Customer cust) {
        //return this.age.compareTo(cust.age); // ascending
        return cust.age.compareTo(this.age); // descending
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }

}


class Student {
    Integer age;

    public Student(int custAge) {
        this.age = custAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}



