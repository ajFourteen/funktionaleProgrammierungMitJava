package de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.dont;

import java.util.Collection;
import java.util.List;

import static de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.dont.Mathematics.difference;
import static de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.dont.Mathematics.square;

final class Dont {

    void doSomething() {
        Collection<Integer> ints = List.of(12, 1, 9, 5, 7);

        int closestDistanceTo42AfterSquared = ints.stream()
                .map(square)
                .map(difference.apply(42))
                .map(Math::abs)
                .reduce(Integer.MAX_VALUE, Math::min);
    }
}