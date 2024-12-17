package de.fourteen.funktionaleprogrammierunginjava.mixing.fpinoop.alternative;

final class Alternative {
    void doSomething() {
        FirstClassIntegerCollection ints = new FirstClassIntegerCollection(12, 1, 9, 5, 7);

        int closestDistanceTo42AfterSquared =
                ints.closestDistanceTo42AfterSquared();
    }
}