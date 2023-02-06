package org.example.Inheritance.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void example() {
        // variable definition - constructor invocation
        List<Shape> shapes = new ArrayList<>();
        // constructor invocation as a parameter
        // object gets constructed, and then is immediately passed as a parameter

        // example of polymorphism - object has an actual type of Circle,
        // but we perceive it as Shape, so that we can add it to a list of Shapes
        shapes.add(new Circle(7.0));
        shapes.add(new Rectangle(5.0, 4.0));
        shapes.add(new Square(3.0));

        for (Shape shape : shapes) {
            System.out.println(shape.getName());
            System.out.println("Circumference: " + shape.getCircumference());
            System.out.println("Area: " + shape.getArea());
            System.out.println();
        }
    }
}
