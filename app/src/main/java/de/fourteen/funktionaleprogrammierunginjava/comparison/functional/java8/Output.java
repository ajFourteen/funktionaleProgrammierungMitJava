package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8;

import java.util.function.Function;

interface Output {
    Function<Double, String> output = (Double area) -> "Area: " + area;
}