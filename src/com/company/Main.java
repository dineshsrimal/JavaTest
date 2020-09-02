package com.company;

import java.util.*;

public class Main {

    /*public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world ASUS....");
    }*/


    public static void main(String args[])
    {
        /*String str="aaa";
        System.out.println("All substring of abbc are:");


        Set hSet = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                hSet.add(str.substring(i,j));
                // System.out.println(str.substring(i,j));
            }
        }

        List list = new ArrayList(hSet);
        Collections.sort(list);

        System.out.println(list.get(list.size() - 1));*/

        int i=5, j=4, k=9;

        Test.doIt(i,j,k);
        System.out.println(k);
    }
}


class Test{
    static void doIt(int x, int y, int m) {
            if(x==5) m=y;
                else m=x;
    }
}
