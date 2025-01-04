package de.fourteen.funktionaleprogrammierunginjava.multiplication.curried;

import java.util.function.Function;

interface Multiplication extends Function<Double, Function<Double, Double>> {
    Multiplication product = multiplier -> multiplicand -> multiplier * multiplicand;
}