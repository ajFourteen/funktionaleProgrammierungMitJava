package de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.better;

import java.util.Collection;
import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.better.Mathematics.difference;
import static de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.better.Mathematics.square;

interface ClosestDistanceTo42AfterSquaredCalculation extends Function<Collection<Integer>, Integer> {
    ClosestDistanceTo42AfterSquaredCalculation closestDistanceTo42AfterSquaredCalculation = ints -> ints.stream()
            .map(square)
            .map(difference.apply(42))
            .map(Math::abs)
            .reduce(Integer.MAX_VALUE, Math::min);
}
