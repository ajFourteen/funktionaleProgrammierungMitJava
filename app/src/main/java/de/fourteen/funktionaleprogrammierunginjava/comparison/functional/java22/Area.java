package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22;

import java.util.function.Function;

interface Area {

    Function<Rectangle, Double> areaOfRectangle = rectangle -> rectangle.width() * rectangle.height();

    Function<Square, Double> areaOfSquare = square -> square.length() * square.length();

    Function<Circle, Double> areaOfCircle = circle -> circle.radius() * circle.radius() * Math.PI;

    Function<Shape, Double> area = (shape) -> switch (shape) {
        case Rectangle rectangle -> areaOfRectangle.apply(rectangle);
        case Square square -> areaOfSquare.apply(square);
        case Circle circle -> areaOfCircle.apply(circle);
        case NoSuchShape _ -> throw new IllegalArgumentException("No such shape");
    };
}
