package org.example.Inheritance.Shapes;

// Circle inherits from Shape - meaning, Circle IS a Shape
// Defines, that all circles have a radius, and they calculate their circumferences and areas with given formulas
public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    // Overriding means, that for the same method, as defined in the superclass
    // we create a new body, with a new logic
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public Double getCircumference() {
        return 2.0 * Math.PI * this.radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
