package de.fourteen.funktionaleprogrammierunginjava.multiplication.curried;

import static de.fourteen.funktionaleprogrammierunginjava.multiplication.curried.Doubling.doubled;
import static de.fourteen.funktionaleprogrammierunginjava.multiplication.curried.Multiplication.product;

final class Usage {
    public static void main(String[] args) {
        double answer = product.apply(2.0).apply(21.0);
        double sameAnswer = doubled.apply(21.0);
    }
}
