package com.codetest;

/**
 * Created by dineshs on 9/12/2020.
 */
public class ConstructorTest {

    public static void main(String[] args) {
        POJOClass pojoClass = new POJOClass();
    }

}


class POJOClass {
    private String insName;

    /*public POJOClass() {

    }

    public POJOClass(String name) {
        this.insName = name;
    }*/

    public String getName() {
        return insName;
    }

    public void setName(String name) {
        this.insName = name;
    }
}
