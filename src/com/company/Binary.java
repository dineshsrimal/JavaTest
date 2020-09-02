package com.company;

/**
 * Created by dineshs on 7/9/2019.
 */
public class Binary {
    public static void main(String[] args) {
        String s = "011100";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int noOfSteps = 0;
        int number = Integer.parseInt(s, 2);

        while(number != 0) {

            if(number % 2 == 0) {
                number = number / 2;
            }else{
                number--;
            }
            noOfSteps++;
        }


        return noOfSteps;
    }
}
