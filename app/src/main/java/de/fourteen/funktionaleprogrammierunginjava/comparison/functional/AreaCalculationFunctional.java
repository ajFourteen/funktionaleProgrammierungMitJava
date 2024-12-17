package de.fourteen.funktionaleprogrammierunginjava.comparison.functional;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.AreaCalculation.area;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.Output.output;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.ShapeCreation.shape;

interface AreaCalculationFunctional extends AreaCalculation {
    Function<Println, AreaCalculationFunctional> areaCalculationFunctionalCreation =
            println ->
                    input ->
                            println.accept(
                                    output.apply(
                                            area.apply(
                                                    shape.apply(
                                                            input
                                                    )
                                            )
                                    )
                            );
}
