package org.example.Interfaces;

public class Car implements Soundable {
    @Override
    public void makeSound() {
        System.out.println("Brrrrrrr!");
    }
}
