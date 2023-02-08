package org.example.GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class SafeWithGenericValue<T> {
    private final String password;
    private final T value;

    public SafeWithGenericValue(String password, T value) {
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

    public static void example() {
        SafeWithGenericValue<Integer> intSafe = new SafeWithGenericValue<>("1234", 10000);
        SafeWithGenericValue<String> strSafe = new SafeWithGenericValue<>("qwerty", "Mateusz");
        SafeWithGenericValue<Boolean> boolSafe = new SafeWithGenericValue<>("zaq1", true);
        SafeWithGenericValue<SafeWithGenericValue<List<Integer>>> strangeSafe = new SafeWithGenericValue<>("abc", new SafeWithGenericValue<>("def", new ArrayList<>()));

        Integer intValue = intSafe.getValue("1234");
        String strValue = strSafe.getValue("qwerty");
        Boolean boolValue = boolSafe.getValue("zaq1");
        List<Integer> listValue = strangeSafe.getValue("abc").getValue("def");
    }
}
