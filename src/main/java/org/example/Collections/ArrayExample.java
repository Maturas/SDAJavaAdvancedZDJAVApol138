package org.example.Collections;

// Array is a fixed-size ordered collection
public class ArrayExample {
    public static void createEmptyArrayAndAssignValuesAtIndexes() {
        // Singular: index
        // Plural: indexes / indices

        Integer[] numbers = new Integer[3];
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 20;
    }

    public static void createPrefilledArrayAndReadValuesAtIndexes() {
        String[] names = new String[] { "Marcus", "John", "Lucas", "Matthew" };
        String firstName = names[0];
        String lastName = names[3];
    }

    public static void iterateOverArrayIndexesAndPrintValues() {
        String[] names = new String[] { "Marcus", "John", "Lucas", "Matthew" };

        for (Integer i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }
    }

    public static void iterateOverArrayValuesAndPrintThem() {
        String[] names = new String[] { "Marcus", "John", "Lucas", "Matthew" };

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static Integer[] getReverseArray(Integer[] array) {
        Integer[] reverseArray = new Integer[array.length];

        for (Integer i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }

        return reverseArray;
    }

    public static void printEveryOtherNumber(Integer[] array) {
        for (Integer i = 0; i < array.length; i += 2) {
            System.out.println(array[i]);
        }
    }

    public static Integer getMax(Integer[] array) {
        Integer maxValue = Integer.MIN_VALUE;

        for (Integer number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }

        return maxValue;
    }

    public static Integer getMin(Integer[] array) {
        Integer minValue = Integer.MAX_VALUE;

        for (Integer number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }

        return minValue;
    }

    public static Double printAverage(Integer[] array) {
        Double sum = 0.0;

        for (Integer number : array) {
            sum += number;
        }

        Double average = sum / array.length;

        return average;
    }
}
