package org.example.Interfaces;

// Concrete class, which implements an interface
// MUST implement all of its methods
public class Human implements Soundable, Eatable {
    @Override
    public void makeSound() {
        System.out.println("Hello, World!");
    }

    @Override
    public void eat(String food) {
        System.out.println("Om nom nom " + food);
    }
}
