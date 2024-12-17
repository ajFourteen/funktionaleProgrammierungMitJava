package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging;

import com.google.inject.Inject;

import java.util.function.Consumer;

final class ObjectorientedLogger implements Logging {

    private final PrintLn println;

    @Inject
    ObjectorientedLogger(final PrintLn println) {
        this.println = println;
    }

    @Override
    public double logged(final double valueToLog) {
        println.accept(valueToLog);
        return valueToLog;
    }
}

interface PrintLn extends Consumer<Double> {
}