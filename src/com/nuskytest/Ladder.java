package com.nuskytest;

/**
 * Created by dineshs on 9/27/2020.
 */
public class Ladder {
    public static void main(String[] args) {
        //String[] args1 = {"X"};
        try{
            System.out.println(doStuff(args));
        }catch(Exception e) {
            System.out.println("excec");
            doStuff(args);
        }

    }

    public static int doStuff(String[] arg) {
        return Integer.parseInt(arg[0]);
    }
}
