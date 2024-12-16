package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14;

import java.util.List;

interface Shape {

    static double calculateArea(String shape, List<Double> params) {
        return switch (shape) {
            case "rectangle" -> calculateAreaOfRectangle(params.get(0), params.get(1));
            case "square" -> calculateAreaOfSquare(params.get(0));
            case "circle" -> calculateAreaOfCircle(params.get(0));
            default -> throw new IllegalArgumentException("No such shape");
        };
    }

    static double calculateAreaOfRectangle(double width, double height) {
        return width * height;
    }

    static double calculateAreaOfSquare(double length) {
        return length * length;
    }

    static double calculateAreaOfCircle(double radius) {
        return radius * radius * Math.PI;
    }
}
