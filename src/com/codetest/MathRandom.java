package com.codetest;

/**
 * Created by dineshs on 9/17/2020.
 */
public class MathRandom {

    public static void main(String[] args) {
        //Generate random number from range 1 - 10
        int max = 10;
        int min = 1;


        for(int i = 0; i < 20; i++) {
            int randomNo = (int) (Math.random() * (max - min) + min);
            System.out.println("Random No: " + randomNo);
        }

    }
}
