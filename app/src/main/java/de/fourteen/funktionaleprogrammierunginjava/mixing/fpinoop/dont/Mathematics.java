package de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.dont;

import java.util.function.Function;

interface Mathematics {
    Function<Integer, Function<Integer, Integer>> difference = minuend -> subtrahend -> minuend - subtrahend;
    Function<Integer, Integer> square = n -> n * n;
}