package org.example.GenericTypes;

public class NonGenericSafe {
    private final String password;
    private final Integer value;

    public NonGenericSafe(String password, Integer value) {
        this.password = password;
        this.value = value;
    }

    public Integer getValue(String password) {
        if (this.password.equals(password)) {
            return this.value;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void example() {
        NonGenericSafe safe = new NonGenericSafe("1234", 10000);
        System.out.println(safe.getValue("12345"));
    }
}
