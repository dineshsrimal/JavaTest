package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by dineshs on 9/16/2020.
 */
public class ConvertListToMap {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Dinesh", "Saman", "Lenin");

        getStrMap(strList).forEach((k, v) -> System.out.println(k + " : " + v));

        getObjList(strList).forEach(customer -> System.out.println(customer.toString()));
    }

    public static List<Customer> getObjList(List<String> strList) { // Note:- use Stream.map return list of new Object type from existing list elements
        return strList.stream()
                .map(s -> {
                    int age = new Random().nextInt(10 - 5) + 5;
                    return new Customer(s, age);
                })
                .collect(Collectors.toList());
    }

    public static Map<String, String> getStrMap(List<String> strList) { // Note:- use Collectors.toMap to generate Map from List
        return strList.stream().collect(Collectors.toMap(Function.identity(), s->s));
    }

}

class Customer {
    private String name;
    private int age;

    public Customer(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
