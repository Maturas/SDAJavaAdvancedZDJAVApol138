package org.example.GenericTypes.CollectionsOfGenericObjects;

import java.util.ArrayList;
import java.util.List;

public class GenericSafe<T> {
    private final String password;
    private final T value;

    public GenericSafe(String password, T value) {
        this.password = password;
        this.value = value;
    }

    public T getValue(String password) {
        if (this.password.equals(password)) {
            return this.value;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void printInformation() {
        System.out.println(this.value);
    }

    public static void example() {
        GenericSafe<String> safeString = new GenericSafe<>("x", "xxx");
        GenericSafe<Integer> safeInteger = new GenericSafe<>("m", 123);
        GenericSafe<Double> safeDouble = new GenericSafe<>("z", 99.99);

        // Please try to avoid this, there's very little we can do with such a list
        List<GenericSafe<?>> listOfSafesWithUnknownValues = new ArrayList<>();
        listOfSafesWithUnknownValues.add(safeString);
        listOfSafesWithUnknownValues.add(safeInteger);
        listOfSafesWithUnknownValues.add(safeDouble);

        for (GenericSafe<?> safe : listOfSafesWithUnknownValues) {
            safe.printInformation();
        }
    }
}
