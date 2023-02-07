package org.example.FinalKeyword;

// Final classes cannot be inherited from
public final class ChildClass extends BaseClass {
    @Override
    public void someMethod() {
        System.out.println("Not hello.");
    }
}
