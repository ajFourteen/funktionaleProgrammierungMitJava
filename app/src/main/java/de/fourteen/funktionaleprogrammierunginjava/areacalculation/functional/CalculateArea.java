package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculation;

import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.AreaCalculation.area;
import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.ShapeCreation.shape;

interface CalculateArea extends AreaCalculation {
    CalculateArea calculateArea = input -> area.apply(shape.apply(input));
}
