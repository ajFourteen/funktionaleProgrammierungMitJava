package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations;

import java.util.function.Function;

interface LoggedAddition {
    Function<Function<Double, Double>, Function<Double, Function<Double, Double>>> loggedSum =
            logged -> a -> b -> logged.apply(a + b);
}