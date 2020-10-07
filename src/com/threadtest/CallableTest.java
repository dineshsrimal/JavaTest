package com.threadtest;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<Integer> randomIntFuture = executor.submit(new CallableTask()); // Executor service with Callable
        Integer ranVal = 0;

        try {
            ranVal = randomIntFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Random val: " + ranVal);

        System.out.println("===================================");

        Future randomIntFuture2 = executor.submit(new RunnableTask()); // Executor service with Runnable
        try {
            System.out.println("Random val 2: " + randomIntFuture2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}


class CallableTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int randomNo = (int) (Math.random() * (100 - 1) + 1);
        Thread.sleep(1000);

        return randomNo;
    }
}


class RunnableTask implements Runnable {

    @Override
    public void run() {
        int randomNo = (int) (Math.random() * (100 - 1) + 1);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Random val: " + randomNo);
    }
}