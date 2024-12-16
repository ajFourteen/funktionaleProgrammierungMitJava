package de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better;

import com.google.inject.Inject;
import de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance.ClosestDistanceTo42AfterSquaredCalculation;

import java.util.Collection;
import java.util.List;

class Better {

    private final ClosestDistanceTo42AfterSquaredCalculation calculation;

    @Inject
    Better(final ClosestDistanceTo42AfterSquaredCalculation calculation) {
        this.calculation = calculation;
    }

    void doSomething() {
        Collection<Integer> ints = List.of(12, 1, 9, 5, 7);

        int closestDistanceTo42AfterSquared =
                calculation.calculateClosestDistanceTo42AfterSquared(ints);
    }
}
