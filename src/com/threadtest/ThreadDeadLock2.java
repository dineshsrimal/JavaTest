package com.threadtest;

/**
 * Created by dineshs on 9/10/2020.
 */
public class ThreadDeadLock2 {



    public static void main(String[] args) {

        final String strObj1 = "Dinesh";
        final String strObj2 = "Prathibha";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (strObj1) {
                    System.out.println("Thread 1 acquired lock of String Object 1...");
                    System.out.println("Thread 1 waiting for lock of String Object 2...");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (strObj2) {
                        System.out.println("Thread 1 acquired lock of String Object 2...");
                    }

                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (strObj2) {
                    System.out.println("Thread 2 acquired lock of String Object 2...");
                    System.out.println("Thread 2 waiting for lock of String Object 1...");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (strObj1) {
                        System.out.println("Thread 2 acquired lock of String Object 1...");
                    }

                }
            }
        });

        t1.start();
        t2.start();

    }


}
