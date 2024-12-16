package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging;

import java.util.function.Consumer;
import java.util.function.Function;

interface FunctionalLogger {
    Function<Consumer<Double>, Logger> logged = println -> valueToLog -> {
        println.accept(valueToLog);
        return valueToLog;
    };

    Logger loggedToConsole = logged.apply(System.out::println);
}