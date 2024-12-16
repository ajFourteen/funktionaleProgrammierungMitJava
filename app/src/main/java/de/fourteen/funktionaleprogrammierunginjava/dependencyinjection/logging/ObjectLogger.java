package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging;

import com.google.inject.Inject;

import java.util.function.Consumer;

final class ObjectLogger implements Logger {

    private final PrintLn println;

    @Inject
    ObjectLogger(final PrintLn println) {
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
