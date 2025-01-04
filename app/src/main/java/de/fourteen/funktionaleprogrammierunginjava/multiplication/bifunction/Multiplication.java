package de.fourteen.funktionaleprogrammierunginjava.multiplication.bifunction;

import java.util.function.BiFunction;

interface Multiplication extends BiFunction<Double, Double, Double> {
    Multiplication product = (multiplier, multiplicand) -> multiplier * multiplicand;
}