package org.example.Inheritance.Shapes;

// Rectangle inherits from Shape; Rectangle IS a Shape
// Defines, that all rectangles have two lengths - a and b
public class Rectangle extends Shape {
    private Double a;
    private Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public Double getCircumference() {
        return 2.0 * (a + b);
    }

    @Override
    public Double getArea() {
        return a * b;
    }
}
