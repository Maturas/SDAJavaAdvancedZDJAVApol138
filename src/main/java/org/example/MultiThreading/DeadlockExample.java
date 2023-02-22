package org.example.MultiThreading;

public class DeadlockExample {
    private static final Object a = new Object();
    private static final Object b = new Object();

    public static void example() {
        Thread t1 = new Thread(() -> {
            synchronized (a) {
                System.out.println("Thread 1: Holding object A");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (b) {
                    System.out.println("Thread 1: holding object B");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("Thread 2: Holding object B");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (a) {
                    System.out.println("Thread 2: holding object A");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }
}
