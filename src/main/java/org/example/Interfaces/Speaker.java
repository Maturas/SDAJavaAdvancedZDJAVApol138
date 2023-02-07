package org.example.Interfaces;

public class Speaker implements Soundable  {
    @Override
    public void makeSound() {
        System.out.println("Playing music");
    }
}
