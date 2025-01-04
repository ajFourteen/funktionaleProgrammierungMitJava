package de.fourteen.funktionaleprogrammierunginjava.multiplication.curried;

import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.multiplication.curried.Multiplication.product;

interface Doubling extends Function<Double, Double> {
    Doubling doubled = product.apply(2.0)::apply;
}
