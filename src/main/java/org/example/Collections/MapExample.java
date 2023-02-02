package org.example.Collections;

import java.util.HashMap;
import java.util.Map;

// Map is a variable-size unordered collection, with unique keys, and a single value for each key
public class MapExample {
    public static void createMapOfSalaries() {
        // Almost always use String or Integer as key!
        // Don't use Booleans - because it doesn't make sense
        // Don't use Float, Double, because they're imprecise!
        // Don't use complex objects, because they're slow and problematic!

        // Map: key - employee's name (unique), value - employee's salary (non-unique)
        Map<String, Integer> employeeSalaries = new HashMap<>();

        employeeSalaries.put("Karol", 5000);
        employeeSalaries.put("Anna", 7500);
        employeeSalaries.put("Jakub", 1500); // duplicate values are allowed
        employeeSalaries.put("James", 1500);
        // employeeSalaries.put("Anna", 6000); // duplicate keys are NOT allowed

        // key-based iterating over a hashmap
        for (String name : employeeSalaries.keySet()) {
            Integer salary = employeeSalaries.get(name);
            System.out.println(name + " earns " + salary + " PLN");
        }

        // entry-based iterating over a hashmap
        for (Map.Entry<String, Integer> entry : employeeSalaries.entrySet()) {
            System.out.println(entry.getKey() + " earns " + entry.getValue());
        }
    }
}
