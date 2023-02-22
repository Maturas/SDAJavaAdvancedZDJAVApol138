package org.example.FunctionalProgramming.StreamsExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonQueries {
    // Zwróć osobę o danym imieniu i nazwisku.
    public static Optional<Person> findPersonByName(List<Person> people, String firstName, String lastName) {
        return people.stream().filter(person -> person.getFirstName().equals(firstName)
                && person.getLastName().equals(lastName)).findFirst();
    }

    // Zwróć najstarszą osobę.
    public static Optional<Person> findOldestPerson(List<Person> people) {
        return people.stream().max(Comparator.comparingInt(Person::getAge));
    }

    // Zwróć imię najmłodszej osoby.
    public static Optional<String> findNameOfYoungestPerson(List<Person> people) {
        return people.stream().min(Comparator.comparingInt(Person::getAge)).map(Person::getFirstName);
    }

    // Zwróć listę osób po 30stce.
    public static List<Person> findPeopleOver30(List<Person> people) {
        return people.stream().filter(person -> person.getAge() >= 30).collect(Collectors.toList());
    }

    // Zwróć średni wiek wszystkich osób z listy.
    public static Double calculateAverageAge(List<Person> people) {
        return people.stream().mapToInt(Person::getAge).average().orElse(0);
    }

    // Zwróć listę imion wszystkich osób.
    public static List<String> getAllFirstNames(List<Person> people) {
        return people.stream().map(Person::getFirstName).collect(Collectors.toList());
    }

    // Zwróć listę osób, w kolejności od najstarszego do najmłodszego.
    public static List<Person> sortByAge(List<Person> people) {
        return people.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).collect(Collectors.toList());
    }

    // Zwróć listę hobby wszystkich osób (bez powtórzeń).
    public static List<String> getAllHobbies(List<Person> people) {
        return people.stream().flatMap(person ->
                Arrays.stream(person.getHobbies())).distinct().collect(Collectors.toList());
    }

    // Zwróć listę osób po 20stce, w kolejności od osoby z najmniejszą ilością hobby do osoby z największą ilością hobby.
    public static List<Person> findPeopleOver20SortedByHobbyCount(List<Person> people) {
        return people.stream().filter(person -> person.getAge() >= 20)
                .sorted(Comparator.comparingInt(person -> person.getHobbies().length))
                .collect(Collectors.toList());
    }

    // Zwróć listę osób, z czego każdej zwiększyłeś wiek o 10 (zmiana ta nie występuje w oryginalnej liście).
    public static List<Person> addTenYearsToAge(List<Person> people) {
        return people.stream()
                .map(person -> new Person(person).setAge(person.getAge() + 10))
                .collect(Collectors.toList());
    }
}
