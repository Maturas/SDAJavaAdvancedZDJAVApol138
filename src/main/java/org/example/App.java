package org.example;

import org.example.Reflection.Book;
import org.example.Reflection.ReflectionExamples;

public class App
{
    public static void main( String[] args ) {
        ReflectionExamples.example(new Book("Harry Potter", "JK Rowling", 400));
    }
}
