package org.example.FunctionalProgramming.StreamsExercise;

public class Person {
    private final String firstName;
    private final String lastName;
    private Integer age;
    private String[] hobbies;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public Person(String firstName, String lastName, Integer age, String[] hobbies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hobbies = hobbies;
    }

    public Person(Person original) {
        this.firstName = original.firstName;
        this.lastName = original.lastName;
        this.age = original.age;
        this.hobbies = original.hobbies;
    }
}
