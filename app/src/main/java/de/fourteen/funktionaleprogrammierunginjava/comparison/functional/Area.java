package de.fourteen.funktionaleprogrammierunginjava.comparison.functional;

import java.util.function.Function;

interface AreaCalculation extends Function<Shape, Double> {

    Function<Rectangle, Double> areaOfRectangle = rectangle -> rectangle.length() * rectangle.width();

    Function<Square, Double> areaOfSquare = square -> square.length() * square.length();

    Function<Circle, Double> areaOfCircle = circle -> Math.PI * circle.radius() * circle.radius();

    AreaCalculation area = shape -> switch (shape) {
        case Rectangle rectangle -> areaOfRectangle.apply(rectangle);
        case Square square -> areaOfSquare.apply(square);
        case Circle circle -> areaOfCircle.apply(circle);
    };
}