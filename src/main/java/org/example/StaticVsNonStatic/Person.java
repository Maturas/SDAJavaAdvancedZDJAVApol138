package org.example.StaticVsNonStatic;

import java.util.ArrayList;
import java.util.List;

public class Person {
    // This field is static, which means it's dependent on the class, and independent of individual objects
    private static List<Person> allPersons = new ArrayList<>();

    // These fields are non-static, which means, they are dependent on individual objects
    private String name;
    private Integer age;
    private String city;

    public Person(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        allPersons.add(this);
    }

    // These methods are non-static, which means their results are dependent on individual objects
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void introduce() {
        System.out.println("Hello, I am " + this.name + ", I am "
                + this.age + " years old and I live in " + this.city);
    }

    public static List<Person> getAllPersons() {
        return allPersons;
    }

    // This method is static, which means its results is independent of individual objects
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }
}
