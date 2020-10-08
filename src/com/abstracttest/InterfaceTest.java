package com.abstracttest;

public class InterfaceTest implements intf1, intf2{
    @Override
    public void m1() {
        //implementation goes here
    }



    @Override
    public void m2() {
        //implementation goes here
    }

    @Override
    public void m3() {
        /*Note that if both interfaces provide same default implementation child class must override it
        Otherwise no need to*/
    }
}

interface intf1{
    abstract void m1();

    public default void m3() {

    }

}

interface intf2{
    abstract void m2();

    public default void m3() {

    }
}
