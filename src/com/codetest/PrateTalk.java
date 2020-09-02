package com.codetest;

import java.util.Properties;

public class PrateTalk {

    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.setProperty("pirate", "scurvy");
        String s = p.getProperty("argProp") + " ";
        s += p.getProperty("pirate");
        System.out.println(s);
    }
}
