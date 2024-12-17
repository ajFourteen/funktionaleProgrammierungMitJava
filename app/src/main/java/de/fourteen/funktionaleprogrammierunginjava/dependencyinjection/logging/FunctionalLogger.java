package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging;

import java.util.function.Consumer;
import java.util.function.Function;

interface FunctionalLogger {
    Function<Consumer<Double>, Logging> logged = println -> valueToLog -> {
        println.accept(valueToLog);
        return valueToLog;
    };

    Logging loggedToConsole = logged.apply(System.out::println);
}