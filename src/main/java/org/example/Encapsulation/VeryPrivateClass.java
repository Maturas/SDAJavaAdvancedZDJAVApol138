package org.example.Encapsulation;

public class VeryPrivateClass {
    // Can only access private fields inside this class
    private String name;
    private Integer number;

    // Can only invoke private methods inside this class
    private void doSomething() {
        this.name = "Charles";
        this.number = 100;
    }

    private static void doSomethingStatic() {
        System.out.println("Hello, World!");
    }
}
