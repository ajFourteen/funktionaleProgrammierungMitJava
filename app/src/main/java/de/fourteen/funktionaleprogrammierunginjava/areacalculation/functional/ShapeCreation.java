package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import java.util.function.Function;

import static java.lang.Double.parseDouble;

interface ShapeCreation extends Function<String[], Shape> {
    ShapeCreation shape = input -> switch (input[0]) {
        case "rectangle" -> new Rectangle(parseDouble(input[1]), parseDouble(input[2]));
        case "square" -> new Square(parseDouble(input[1]));
        case "circle" -> new Circle(parseDouble(input[1]));
        default -> throw new IllegalArgumentException("no such shape");
    };
}
