package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java21;

import java.util.List;

interface ShapeUtils {

    static Shape createShape(String shape, List<Double> params) {
        return switch (shape) {
            case "rectangle" -> new Rectangle(params.get(0), params.get(1));
            case "square" -> new Square(params.get(0));
            case "circle" -> new Circle(params.get(0));
            default -> throw new IllegalArgumentException("No such shape");
        };
    }

    static double calculateArea(Shape shape) {
        return switch (shape) {
            case Rectangle rectangle -> calculateAreaOfRectangle(rectangle);
            case Square square -> calculateAreaOfSquare(square);
            case Circle circle -> calculateAreaOfCircle(circle);
        };
    }

    static double calculateAreaOfRectangle(Rectangle rectangle) {
        return rectangle.width() * rectangle.height();
    }

    static double calculateAreaOfSquare(Square square) {
        return square.length() * square.length();
    }

    static double calculateAreaOfCircle(Circle circle) {
        return circle.radius() * circle.radius() * Math.PI;
    }
}
