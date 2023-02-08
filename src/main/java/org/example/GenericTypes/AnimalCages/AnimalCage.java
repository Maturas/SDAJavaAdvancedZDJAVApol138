package org.example.GenericTypes.AnimalCages;

import java.util.ArrayList;
import java.util.List;

// Generic type constraints
// T extends SomeClass (T is a subclass of SomeClass)
// T super SomeClass (T is a superclass of SomeClass)
// T implements SomeInterface (T implements SomeInterface)
// Type constraints allow for more functionalities than unconstrained types
public class AnimalCage<T extends Animal> {
    private T capturedAnimal;

    public Boolean putIn(T animal) {
        if (this.capturedAnimal != null) {
            throw new IllegalArgumentException();
        }
        else {
            this.capturedAnimal = animal;
            animal.sleep();
            return true;
        }
    }

    public T takeOut() {
        if (this.capturedAnimal == null) {
            throw new NullPointerException();
        }
        else {
            T animal = this.capturedAnimal;
            this.capturedAnimal = null; // Nullification
            animal.eat();
            return animal;
        }
    }

    public static void example() {
        Dog dog = new Dog();
        AnimalCage<Dog> dogCage = new AnimalCage<>();
        dogCage.putIn(dog);

        Cat cat = new Cat();
        AnimalCage<Cat> catCage = new AnimalCage<>();
        catCage.putIn(cat);
        cat = catCage.takeOut();

        // A collection of generic objects, where the generic type is unknown, but has a constraint
        // That constaint gives us some functionalities
        List<AnimalCage<? extends Animal>> cages = new ArrayList<>();
        cages.add(dogCage);
        cages.add(catCage);

        // We don't know, what animals are inside these cages
        // But we know that they ARE animals
        // Therefore, we can safely upcast them into animals
        // And invoke Animal methods on them
        for (AnimalCage<? extends Animal> cage : cages) {
            Animal animalFromCage = cage.takeOut();
            animalFromCage.eat();
            animalFromCage.sleep();
        }

        // AnimalCage<Integer> intCage = new AnimalCage<>();
        // intCage.putIn(42);
    }
}
