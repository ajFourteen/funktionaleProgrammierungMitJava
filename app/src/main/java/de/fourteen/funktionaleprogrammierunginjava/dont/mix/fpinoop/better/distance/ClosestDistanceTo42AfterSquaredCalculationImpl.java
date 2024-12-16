package de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance;

import static de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance.Mathematics.distanceTo;
import static de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance.Mathematics.square;

interface ClosestDistanceTo42AfterSquaredCalculationImpl {
    ClosestDistanceTo42AfterSquaredCalculation closestDistanceTo42AfterSquared =
            ints -> ints.stream()
                    .map(square)
                    .map(distanceTo.apply(42))
                    .map(Math::abs)
                    .reduce(Integer.MAX_VALUE, Math::min);
}
