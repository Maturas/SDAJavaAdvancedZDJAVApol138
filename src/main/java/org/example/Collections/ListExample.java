package org.example.Collections;

import java.util.ArrayList;
import java.util.List;

// List is a variable-size ordered collection
public class ListExample {
    public static void createEmptyListAndAddElements() {
        List<String> namesList = new ArrayList<>();

        // append - add to the end of the list
        namesList.add("Anna");
        namesList.add("Joanna");
        namesList.add("Lena");
    }

    public static void getElementFromList() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Anna");
        namesList.add("Joanna");
        namesList.add("Lena");

        // use get(0) instead of [0]
        // Same rules apply as array index
        String element = namesList.get(0);
    }

    public static void swapValueInList() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Anna");
        namesList.add("Joanna");
        namesList.add("Lena");

        // set - swap old value at given index to a new one
        namesList.set(1, "Karol");
    }

    public static void removeFromList() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Anna");
        namesList.add("Joanna");
        namesList.add("Lena");

        // Remove value
        namesList.remove("Joanna");

        // Use int, not Integer, when dealing with List indexes
        int index = 1;

        // Remove at index
        namesList.remove(index);
    }

    public static void iterateOverList() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Anna");
        namesList.add("Joanna");
        namesList.add("Lena");

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        for (String name : namesList) {
            System.out.println(name);
        }
    }

    public static void insertIntoList() {
        List<String> namesList = new ArrayList<>();

        namesList.add("Anna");
        namesList.add("Joanna");
        namesList.add("Lena");

        // insert into the beginning of the list
        namesList.add(0, "Karol");
    }
}
