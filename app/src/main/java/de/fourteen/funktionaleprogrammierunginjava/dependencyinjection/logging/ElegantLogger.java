package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging;

import java.util.function.Consumer;
import java.util.function.Function;

final class ElegantLogger implements Logging {

    private final Function<Double, Logged> loggedFactory;

    ElegantLogger() {
        this(LoggedToConsole::new);
    }

    ElegantLogger(final Function<Double, Logged> loggedFactory) {
        this.loggedFactory = loggedFactory;
    }

    @Override
    public double logged(final double valueToLog) {
        return loggedFactory.apply(valueToLog).value();
    }
}

interface Logged {
    double value();
}

final class LoggedToConsole implements Logged {
    private final double valueToLog;
    private final Consumer<Double> println;

    LoggedToConsole(final double valueToLog) {
        this(valueToLog, System.out::println);
    }

    LoggedToConsole(final double valueToLog, final Consumer<Double> println) {
        this.valueToLog = valueToLog;
        this.println = println;
    }

    @Override
    public double value() {
        println.accept(valueToLog);
        return valueToLog;
    }
}