package de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.alternative;

import java.util.Collection;
import java.util.List;

final class FirstClassIntegerCollection {
    private Collection<Integer> ints;

    FirstClassIntegerCollection(Integer... ints) {
        this.ints = List.of(ints);
    }

    int closestDistanceTo42AfterSquared() {
        return ints.stream()
                .map(n -> n * n)
                .map(n -> 42 - n)
                .map(Math::abs)
                .reduce(Integer.MAX_VALUE, Math::min);
    }
}