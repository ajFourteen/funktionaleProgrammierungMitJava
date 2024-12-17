package de.fourteen.funktionaleprogrammierunginjava.comparison.functional;

import java.util.function.Function;

interface Output extends Function<Double, String> {
    Output output = area -> "Area: " + area;
}
