package org.example.Inheritance.Organisms;

// Human inherits from Mammal, which inherits from Animal, which inherits from Organism
// Because of that, Human not only has its own methods (and fields), but also methods and field
// declared in Mammal, Animal and Organism.

// Human is a subclass of Mammal; Mammal is a superclass of Human
// Human is an inheritor of Mammal; Mammal is being inherited by Human
// Human derives from Mammal; Mammal is being derived by Human

// In Java (and in most OOP languages) multiple inheritance is impossible
public class Human extends Mammal {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void speak() {

    }

    public void build() {

    }

    public static void example() {
        Human human = new Human("Charles");

        // can invoke methods declared in Human
        human.speak();
        human.build();

        // and also can invoke methods from all inherited classes
        human.produceMilk();
        human.sleep();
        human.breathe();
        human.nutrition();
        human.reproduce();
    }
}
