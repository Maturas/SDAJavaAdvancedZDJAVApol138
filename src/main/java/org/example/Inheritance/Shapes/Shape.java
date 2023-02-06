package org.example.Inheritance.Shapes;

// Shape - a general base class for all shapes
// Defines, that all shapes have a name, a circumference and an area
// Shape is an abstract class; it cannot be instantiated (have objects)
// instead, it serves as a base/template for its concrete (non-abstract) subclasses
public abstract class Shape {
    public abstract String getName();
    public abstract Double getCircumference();
    public abstract Double getArea();
}
