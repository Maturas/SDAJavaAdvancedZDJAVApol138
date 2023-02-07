package org.example.Interfaces;

// interfaces can't have fields
// interfaces can't have constructors or be instantiated
// interfaces can't inherit classes, nor classes can inherit them
// classes implement interfaces (and one class can implement multiple interfaces)
// interface can inherit from one or multiple interfaces
public interface Soundable {
    void makeSound(); // interface method: no access modifier, no body, cannot be static
}
