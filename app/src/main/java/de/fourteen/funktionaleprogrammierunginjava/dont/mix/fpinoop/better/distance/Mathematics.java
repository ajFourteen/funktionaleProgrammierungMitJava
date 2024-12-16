package de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance;

import java.util.function.Function;

interface Mathematics {
    Function<Integer, Function<Integer, Integer>> distanceTo = target -> n -> target - n;
    Function<Integer, Integer> square = n -> n * n;
}
