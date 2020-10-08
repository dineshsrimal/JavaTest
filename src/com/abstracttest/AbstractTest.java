package com.abstracttest;

public class AbstractTest extends absClass1 {
    @Override
    void getName() {

    }
}
//Following is not allowed since mutitple inheritance is not allowed in Java
/*class AbstractTest2 extends absClass1, absClass12{

    @Override
    void getName() {

    }

    @Override
    void getAge() {

    }
}*/

abstract class absClass1 {
    abstract void getName();
}

abstract class absClass12 {
    abstract void getAge();
}
