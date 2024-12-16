package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

import java.util.function.Consumer;
import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14.Area.area;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14.Output.output;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14.Parameters.parameters;

interface AreaCalculationFunctional {
    Function<Consumer<String>, AreaCalculation> areaCalculationFunctional = println -> input -> println.accept(output.apply(area.apply(input[0], parameters.apply(input))));
}
