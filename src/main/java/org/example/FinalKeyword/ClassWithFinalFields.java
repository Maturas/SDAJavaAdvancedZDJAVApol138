package org.example.FinalKeyword;

public class ClassWithFinalFields {
    // Final fields can only have a value assigned at declaration
    private final String name = "Charles";
    // Or at constructor
    private final String lastName;

    // And after that, the field becomes read-only (cannot change value)

    public ClassWithFinalFields(String lastName) {
        this.lastName = lastName;
    }
}
