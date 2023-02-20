package org.example.FunctionalProgramming.FunctionalInterface;

public class StringFunctionClass implements Function {
    private Integer counter = 0;

    @Override
    public String run() {
        this.counter++;

        if (counter < 2) {
            return "Hello, World!";
        }
        else if (counter < 5) {
            return "Hello again!";
        }
        else {
            return "How many times are you going to invoke this?";
        }
    }
}
