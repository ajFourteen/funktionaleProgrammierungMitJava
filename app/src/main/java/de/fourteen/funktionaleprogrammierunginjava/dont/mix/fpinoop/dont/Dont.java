package de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.dont;

import java.util.Collection;
import java.util.List;

import static de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.dont.Mathematics.distanceTo;
import static de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.dont.Mathematics.square;

class Dont {

    void doSomething() {
        Collection<Integer> ints = List.of(12, 1, 9, 5, 7);

        int closestDistanceTo42AfterSquared = ints.stream()
                .map(square)
                .map(distanceTo.apply(42))
                .map(Math::abs)
                .reduce(Integer.MAX_VALUE, Math::min);
    }
}
