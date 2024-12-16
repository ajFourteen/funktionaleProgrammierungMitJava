package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java9;

import java.util.List;

interface Shape {

    static double calculateArea(String shape, List<Double> params) {
        switch (shape) {
            case "rectangle":
                return calculateAreaOfRectangle(params.get(0), params.get(1));
            case "square":
                return calculateAreaOfSquare(params.get(0));
            case "circle":
                return calculateAreaOfCircle(params.get(0));
            default:
                throw new IllegalArgumentException("No such shape");
        }
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
