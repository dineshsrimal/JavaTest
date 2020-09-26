package com.threadtest;

import java.util.*;

/**
 * Created by dineshs on 9/26/2020.
 */
public class ProducerConsumerTest {

    public static List<String> queue = new Vector();
    public static final int MAX_LIMIT = 1000;

    public static void main(String[] args) {
        Thread producer1 = new Thread(new ProducerRunnable(queue, MAX_LIMIT), "Producer 1");
        Thread producer2 = new Thread(new ProducerRunnable(queue, MAX_LIMIT), "Producer 2");
        Thread consumer1 = new Thread(new ConsumerRunnable(queue, MAX_LIMIT), "Consumer 1");
        Thread consumer2 = new Thread(new ConsumerRunnable(queue, MAX_LIMIT), "Consumer 2");
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }

}


class ProducerRunnable implements Runnable {
    public List<String> queue;
    int MAX_CAPACITY;

    public ProducerRunnable(List<String> q, int limit) {
        this.queue = q;
        this.MAX_CAPACITY =limit;
    }

    @Override
    public void run() {

        while (true) {

            System.out.println(Thread.currentThread().getName() +" Queue Size: " + this.queue.size());
            if (queue.size() == this.MAX_CAPACITY) {
                System.out.println(Thread.currentThread().getName() +" waiting...");
                synchronized (queue) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                this.queue.add("message");
                System.out.println(Thread.currentThread().getName() + " Adding message...");

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (queue) {
                queue.notifyAll();
            }
        }
    }
}


class ConsumerRunnable implements Runnable {
    public List<String> queue;
    int MAX_CAPACITY;

    public ConsumerRunnable(List<String> q, int limit) {
        this.queue = q;
        this.MAX_CAPACITY =limit;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println(Thread.currentThread().getName() +" Queue Size: " + this.queue.size());
            if (queue.size() < this.MAX_CAPACITY) {
                synchronized (queue) {
                    queue.notifyAll();
                }
            }



            if (queue.isEmpty()) {
                System.out.println(Thread.currentThread().getName() +" waiting...");
                synchronized (queue) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }else {
                this.queue.remove(0);
                System.out.println(Thread.currentThread().getName() + " Removing message...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
