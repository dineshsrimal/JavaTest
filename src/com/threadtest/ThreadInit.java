package com.threadtest;

/**
 * Created by dineshs on 9/10/2020.
 */
public class ThreadInit {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());

        Thread t3 = new Thread(){
            public void run() {
                System.out.println("Anonymous Thread override");
            }
        };

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Runnable implementation");
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }


}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Extending Thread..");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable implementation..");
    }
}
