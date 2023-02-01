package org.example;

import org.example.SingletonExample.Sun;
import org.example.StaticVsNonStatic.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(Sun.getInstance().getRadius());
        System.out.println(Sun.getInstance().getRadius());

        System.out.println(Person.getAllPersons().size());
        Person james = new Person("James", 22, "Warsaw");
        System.out.println(Person.getAllPersons().size());
        Person john = new Person("John", 40, "New York");
        System.out.println(Person.getAllPersons().size());

        // accessing non-static fields on different objects
        System.out.println(james.getName());
        System.out.println(john.getName());
        System.out.println(james.getAge());
        System.out.println(john.getCity());

        // invoking non-static methods on different objects
        james.introduce();
        john.introduce();

        // invoking static method via class
        Person.helloWorld();

        // invoking non-static methods on objects, while iterating on a static collection
        for (Person person : Person.getAllPersons()) {
            person.introduce();
        }
    }
}
