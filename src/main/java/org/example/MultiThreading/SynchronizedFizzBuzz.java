package org.example.MultiThreading;

public class SynchronizedFizzBuzz extends Thread {
    private final String name;

    private static Integer counter = 0;

    private static synchronized Integer getCounter() {
        return counter;
    }

    private static synchronized Integer incrementCounter() {
        counter++;
        return counter;
    }

    public SynchronizedFizzBuzz(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();

        Integer myCounter = getCounter();

        while (myCounter <= 100) {
            if (myCounter % 15 == 0) {
                System.out.println(this.name + " FizzBuzz" + " " + counter);
            }
            else if (myCounter % 3 == 0) {
                System.out.println(this.name + " Fizz" + " " + counter);
            }
            else if (myCounter % 5 == 0) {
                System.out.println(this.name + " Buzz" + " " + counter);
            }
            else {
                System.out.println(this.name + " " + myCounter);
            }

            myCounter = incrementCounter();
        }
    }

    public static void example() {
        SynchronizedFizzBuzz a = new SynchronizedFizzBuzz("A");
        SynchronizedFizzBuzz b = new SynchronizedFizzBuzz("B");
        SynchronizedFizzBuzz c = new SynchronizedFizzBuzz("C");

        a.start();
        b.start();
        c.start();

        try {
            a.join();
            b.join();
            c.join();

            System.out.println("Finished!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
