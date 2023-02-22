package org.example.MultiThreading;

public class RaceConditionFizzBuzz extends Thread {
    private final String name;

    private static Integer counter = 0;

    public RaceConditionFizzBuzz(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();

        while (counter <= 100) {
            if (counter % 15 == 0) {
                System.out.println(this.name + " FizzBuzz" + " " + counter);
            }
            else if (counter % 3 == 0) {
                System.out.println(this.name + " Fizz" + " " + counter);
            }
            else if (counter % 5 == 0) {
                System.out.println(this.name + " Buzz" + " " + counter);
            }
            else {
                System.out.println(this.name + " " + counter);
            }

            counter++;
        }
    }

    public static void example() {
        RaceConditionFizzBuzz a = new RaceConditionFizzBuzz("A");
        RaceConditionFizzBuzz b = new RaceConditionFizzBuzz("B");
        RaceConditionFizzBuzz c = new RaceConditionFizzBuzz("C");

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
