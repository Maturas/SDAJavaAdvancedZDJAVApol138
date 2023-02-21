package org.example;

import org.example.Reflection.Book;
import org.example.Reflection.ReflectionExamples;

public class App
{
    public static void main( String[] args ) {
        Book hp = new Book("Harry Potter", "JK Rowling", 400);
        ReflectionExamples.printAllFieldsWithCurrentValues(hp);
        ReflectionExamples.changeFieldValue(hp, "title", "Chronicles of Narnia");
        ReflectionExamples.changeFieldValue(hp, "author", "C.S. Lewis");
        ReflectionExamples.printAllFieldsWithCurrentValues(hp);
        ReflectionExamples.invokeMethod(hp, "printInfo");
        ReflectionExamples.invokeMethodWithReturnValue(hp, "getTitle");
        ReflectionExamples.invokeMethodWithParametersAndReturnValue(hp, "someMethodWithParameters",
                new Object[] { "Hello!", 1000, "World!", 55.45 });
    }
}
