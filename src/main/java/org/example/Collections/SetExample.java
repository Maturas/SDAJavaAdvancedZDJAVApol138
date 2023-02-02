package org.example.Collections;

import java.util.HashSet;
import java.util.Set;

// Set is a variable-size unordered collection, without duplicates
public class SetExample {
    public static void createSetAndAddElementsAndIterate() {
        Set<String> names = new HashSet<>();
        names.add("Matthew");
        names.add("Peter");
        names.add("Jacob");
        names.add("John");
        names.add("James");
        names.add("Charles");
        names.add("Elizabeth");
        names.add("Simon");
        names.add("Andrew");
        names.add("Matthew"); // Won't add a second Matthew

        names.remove("John");

        // THERE ARE NO INDEXES IN SETS!!!
        // BECAUSE IT IS AN UNORDERED COLLECTION
        for (String name : names) {
            System.out.println(name);
        }
    }
}
