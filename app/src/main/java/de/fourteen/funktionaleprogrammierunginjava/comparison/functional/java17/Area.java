package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java17;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Area {

    Function<Rectangle, Double> areaOfRectangle = rectangle -> rectangle.width() * rectangle.height();

    Function<Square, Double> areaOfSquare = square -> square.length() * square.length();

    Function<Circle, Double> areaOfCircle = circle -> circle.radius() * circle.radius() * Math.PI;

    BiFunction<String, List<Double>, Double> area = (shape, params) -> switch (shape) {
        case "rectangle" -> areaOfRectangle.apply(new Rectangle(params.get(0), params.get(1)));
        case "square" -> areaOfSquare.apply(new Square(params.get(0)));
        case "circle" -> areaOfCircle.apply(new Circle(params.get(0)));
        default -> throw new IllegalArgumentException("No such shape");
    };
}
