package org.example.Inheritance.Shapes;

public class Example {
    public static void example() {
        Shape shape = new Shape();
        Circle circle = new Circle(7.0);
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Square square = new Square(3.0);

        System.out.println(shape.getName());
        System.out.println(shape.getArea());
        System.out.println(shape.getCircumference());
        System.out.println();

        System.out.println(circle.getName());
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
        System.out.println();

        System.out.println(rectangle.getName());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getCircumference());
        System.out.println();

        System.out.println(square.getName());
        System.out.println(square.getArea());
        System.out.println(square.getCircumference());
        System.out.println();
    }
}
