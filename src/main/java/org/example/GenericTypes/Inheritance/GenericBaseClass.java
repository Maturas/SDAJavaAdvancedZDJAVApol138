package org.example.GenericTypes.Inheritance;

public class GenericBaseClass<T> {
    public void doGenericStuff(T element) {
        System.out.println(element.toString());
    }
}
