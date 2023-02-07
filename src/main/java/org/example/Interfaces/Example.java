package org.example.Interfaces;

import org.example.ObjectRelations.Association.B;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void example() {
        // Object human has an actual type of Human
        Human human = new Human();
        Bird bird = new Bird();

        List<Soundable> soundables = new ArrayList<>();
        soundables.add(human); // Here it becomes perceived as a Soundable
        soundables.add(bird);
        soundables.add(new Car());
        soundables.add(new Speaker());
        soundables.add(new Trumpet());

        for (Soundable soundable : soundables) {
            soundable.makeSound();
        }

        List<Eatable> eatables = new ArrayList<>();
        eatables.add(human); // And here it becomes perceived as an Eatable
        eatables.add(bird);

        for (Eatable eatable : eatables) {
            eatable.eat("Bread");
        }
    }
}
