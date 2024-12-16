package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22;

import java.util.List;
import java.util.function.BiFunction;

sealed interface Shape permits Rectangle, Square, Circle, NoSuchShape {

    BiFunction<String, List<Double>, Shape> shape = (shape, params) ->
            switch (shape) {
                case "rectangle" -> new Rectangle(params.get(0), params.get(1));
                case "square" -> new Square(params.get(0));
                case "circle" -> new Circle(params.get(0));
                default -> new NoSuchShape();
            };
}

record Rectangle(double width, double height) implements Shape {
}

record Square(double length) implements Shape {
}

record Circle(double radius) implements Shape {
}

record NoSuchShape() implements Shape {
}
