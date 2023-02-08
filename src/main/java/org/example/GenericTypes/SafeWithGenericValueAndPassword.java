package org.example.GenericTypes;

public class SafeWithGenericValueAndPassword<TPassword, TValue> {
    private final TPassword password;
    private final TValue value;

    public SafeWithGenericValueAndPassword(TPassword password, TValue value) {
        this.password = password;
        this.value = value;
    }

    public TValue getValue(TPassword password) {
        if (this.password.equals(password)){
            return this.value;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public static void example() {
        SafeWithGenericValueAndPassword<String, Integer> safeOne = new SafeWithGenericValueAndPassword<>("qwerty", 100);
        SafeWithGenericValueAndPassword<Integer, Integer> safeTwo = new SafeWithGenericValueAndPassword<>(555, 780);
        SafeWithGenericValueAndPassword<Boolean, Double> safeThree = new SafeWithGenericValueAndPassword<>(true, 65.78);

        Double value = safeThree.getValue(true);
    }
}
