package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14.Area.output;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14.Shape.calculateArea;
import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14.StringArrayUtils.rest;

interface AreaCalculationFunctional {

    static AreaCalculation areaCalculationFunctional(Consumer<String> println) {
        return (var input) -> println.accept(output(calculateArea(input[0], params(input))));
    }

    private static List<Double> params(String[] input) {
        return Stream.of(rest(input))
                .map(Double::parseDouble)
                .collect(Collectors.toUnmodifiableList());
    }
}
