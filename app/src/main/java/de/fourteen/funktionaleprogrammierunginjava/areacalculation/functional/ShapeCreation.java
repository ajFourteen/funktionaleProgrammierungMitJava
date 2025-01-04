package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.CircleCreation.circle;
import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.RectangleCreation.rectangle;
import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.SquareCreation.square;

interface ShapeCreation extends Function<String, Function<Double[], Shape>> {
    ShapeCreation shape = shape -> switch (shape) {
        case "rectangle" -> rectangle::apply;
        case "square" -> square::apply;
        case "circle" -> circle::apply;
        default -> throw new IllegalArgumentException("no such shape");
    };
}

interface RectangleCreation extends Function<Double[], Rectangle> {
    RectangleCreation rectangle = sizeConfiguration ->
            new Rectangle(sizeConfiguration[0], sizeConfiguration[1]);
}

interface SquareCreation extends Function<Double[], Square> {
    SquareCreation square = sizeConfiguration -> new Square(sizeConfiguration[0]);
}

interface CircleCreation extends Function<Double[], Circle> {
    CircleCreation circle = sizeConfiguration -> new Circle(sizeConfiguration[0]);
}

