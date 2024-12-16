package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

import java.util.function.Consumer;
import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8.Area.area;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8.Output.output;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8.Parameters.parameters;

interface AreaCalculationFunctional {
    Function<Consumer<String>, AreaCalculation> areaCalculationFunctional = (Consumer<String> println) -> (String[] input) -> println.accept(output.apply(area.apply(input[0], parameters.apply(input))));
}
