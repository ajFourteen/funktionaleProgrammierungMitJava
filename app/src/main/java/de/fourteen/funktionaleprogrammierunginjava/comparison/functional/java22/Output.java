package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22;

import java.util.function.Function;

interface Output {
    Function<Double, String> output = area -> "Area: " + area;
}