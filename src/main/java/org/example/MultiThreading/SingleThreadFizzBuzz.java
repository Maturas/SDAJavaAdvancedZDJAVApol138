package org.example.MultiThreading;

public class SingleThreadFizzBuzz {
    private final String name;

    public SingleThreadFizzBuzz(String name) {
        this.name = name;
    }

    public void doFizzBuzz() {
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
        SingleThreadFizzBuzz a = new SingleThreadFizzBuzz("A");
        SingleThreadFizzBuzz b = new SingleThreadFizzBuzz("B");
        SingleThreadFizzBuzz c = new SingleThreadFizzBuzz("C");

        a.doFizzBuzz();
        b.doFizzBuzz();
        c.doFizzBuzz();
    }
}
