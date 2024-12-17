package de.fourteen.funktionaleprogrammierunginjava.comparison.functional;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.AreaCalculation.area;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.ShapeCreation.shape;

interface CalculateArea extends AreaCalculation {
    CalculateArea calculateArea = input -> area.apply(shape.apply(input));
}
