package org.example.GenericTypes;

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

    public static void example() {
        GenericSafe<Integer> intSafe = new GenericSafe<>("1234", 10000);
        GenericSafe<String> strSafe = new GenericSafe<>("qwerty", "Mateusz");
        GenericSafe<Boolean> boolSafe = new GenericSafe<>("zaq1", true);
        GenericSafe<GenericSafe<List<Integer>>> strangeSafe = new GenericSafe<>("abc", new GenericSafe<>("def", new ArrayList<>()));

        Integer intValue = intSafe.getValue("1234");
        String strValue = strSafe.getValue("qwerty");
        Boolean boolValue = boolSafe.getValue("zaq1");
        List<Integer> listValue = strangeSafe.getValue("abc").getValue("def");
    }
}
