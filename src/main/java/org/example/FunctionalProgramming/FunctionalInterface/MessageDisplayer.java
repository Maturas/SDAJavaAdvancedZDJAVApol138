package org.example.FunctionalProgramming.FunctionalInterface;

public class MessageDisplayer {
    public static void example() {
        // Functional interface implemented by a "normal" class
        display(new StringFunctionClass());

        // Functional interface implemented by an anonymous class
        // This is NOT creation of an object from an interface
        // This is creation of an object, from an anonymous class, which implements an interface
        // Anonymous class - an unnamed, single-use class, created inline, for implementing an interface
        display(new Function() {
            private Integer counter = 0;

            @Override
            public String run() {
                this.counter++;
                return "Secret " + "Message " + this.counter + "!";
            }
        });

        // Lambda Syntax / Lambda Expression
        // Even MORE compact version of implementing functional interfaces
        // Limitations:
        // CANNOT HAVE FIELDS
        // CANNOT IMPLEMENT MORE THAN ONE METHOD!
        // CANNOT HAVE MORE THAN ONE EXPRESSION!
        display(() -> "Lambda generated " + "message!");

        // Lambda Syntax Breakdown:
        // (PARAMETERS) LAMBDA_ARROW EXPRESSION
    }

    private static void display(Function func) {
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
        System.out.println(func.run());
    }
}
