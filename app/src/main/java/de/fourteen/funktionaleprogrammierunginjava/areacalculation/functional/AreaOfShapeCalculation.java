package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.AreaOfCircleCalculation.areaOfCircle;
import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.AreaOfRectangleCalculation.areaOfRectangle;
import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.AreaOfSquareCalculation.areaOfSquare;

interface AreaOfShapeCalculation extends Function<Shape, Double> {
    AreaOfShapeCalculation areaOfShape = shape -> switch (shape) {
        case Rectangle rectangle -> areaOfRectangle.apply(rectangle);
        case Square square -> areaOfSquare.apply(square);
        case Circle circle -> areaOfCircle.apply(circle);
    };
}

interface AreaOfRectangleCalculation extends Function<Rectangle, Double> {
    AreaOfRectangleCalculation areaOfRectangle =
            rectangle -> rectangle.length() * rectangle.width();
}

interface AreaOfSquareCalculation extends Function<Square, Double> {
    AreaOfSquareCalculation areaOfSquare =
            square -> square.length() * square.length();
}

interface AreaOfCircleCalculation extends Function<Circle, Double> {
    AreaOfCircleCalculation areaOfCircle =
            circle -> Math.PI * circle.radius() * circle.radius();
}