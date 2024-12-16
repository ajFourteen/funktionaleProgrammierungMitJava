package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

import java.util.function.Consumer;
import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22.Area.area;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22.Output.output;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22.Parameters.parameters;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22.Shape.shape;

interface AreaCalculationFunctional {
    Function<Consumer<String>, AreaCalculation> areaCalculationFunctional =
            println -> input ->
                    println.accept(
                            output.apply(
                                    area.apply(
                                            shape.apply(
                                                    input[0],
                                                    parameters.apply(input)))));
}
