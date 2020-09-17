package com.casib;

/**
 * Created by dineshs on 7/9/2019.
 */
public class FirstString {

    public static void main(String[] args) {

        System.out.println(solution("@Fdf"));
    }

    public static String solution(String s){

        char c = s.charAt(0);

        if(c >=65 && c<=90){
            return  "upper";
        }else if(c>=97 && c<=122){
            return  "lower";
        }else if(c>=48 && c<=57){
            return  "digit";
        }else {
            return  "other";
        }

    }
}
