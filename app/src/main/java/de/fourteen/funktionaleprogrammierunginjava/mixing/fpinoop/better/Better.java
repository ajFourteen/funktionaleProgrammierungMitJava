package de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.better;

import java.util.Collection;
import java.util.List;

final class Better {

    private final ClosestDistanceTo42AfterSquaredCalculation closestDistanceTo42AfterSquaredCalculation;

    Better(final ClosestDistanceTo42AfterSquaredCalculation closestDistanceTo42AfterSquaredCalculation) {
        this.closestDistanceTo42AfterSquaredCalculation = closestDistanceTo42AfterSquaredCalculation;
    }

    void doSomething() {
        Collection<Integer> ints = List.of(12, 1, 9, 5, 7);

        int closestDistanceTo42AfterSquared = this.closestDistanceTo42AfterSquaredCalculation.apply(ints);
    }
}