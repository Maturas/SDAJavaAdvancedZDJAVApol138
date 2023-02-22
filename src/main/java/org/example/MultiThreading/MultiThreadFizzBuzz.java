package org.example.MultiThreading;

public class MultiThreadFizzBuzz implements Runnable {
    private final String name;

    public MultiThreadFizzBuzz(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (Integer i = 1; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (i % 15 == 0) {
                System.out.println(this.name + " FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println(this.name + " Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println(this.name + " Buzz");
            }
            else {
                System.out.println(this.name + " " + i);
            }
        }
    }

    public static void example() {
        // Create three Thread objects, each with its own multithread fizz buzz object
        Thread a = new Thread(new MultiThreadFizzBuzz("A"));
        Thread b = new Thread(new MultiThreadFizzBuzz("B"));
        Thread c = new Thread(new MultiThreadFizzBuzz("C"));

        // Start three Threads (run it and don't wait for it to finish, just start the next one)
        a.start();
        b.start();
        c.start();

        try {
            // Stop the main thread until threads a, b and c are finished
            a.join();
            b.join();
            c.join();

            // This will execute after threads a, b and c are finished
            System.out.println("Finished!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
