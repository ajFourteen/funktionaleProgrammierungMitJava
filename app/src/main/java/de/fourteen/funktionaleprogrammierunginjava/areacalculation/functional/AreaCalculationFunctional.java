package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import java.util.function.BiFunction;

import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.AreaOfShapeCalculation.areaOfShape;
import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.ShapeCreation.shape;

interface AreaCalculationFunctional extends BiFunction<String, Double[], Double> {
    AreaCalculationFunctional calculatedArea = (shapeName, sizeConfiguration) ->
            areaOfShape.apply(
                    shape.apply(shapeName).apply(sizeConfiguration)
            );
}
