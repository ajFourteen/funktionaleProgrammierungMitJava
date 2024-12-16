package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations;

import de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging.Logger;

import java.util.function.Function;

interface LoggedAddition {
    Function<Logger, Function<Double, Function<Double, Double>>> loggedSum = logger -> a -> b -> logger.logged(a + b);
}
