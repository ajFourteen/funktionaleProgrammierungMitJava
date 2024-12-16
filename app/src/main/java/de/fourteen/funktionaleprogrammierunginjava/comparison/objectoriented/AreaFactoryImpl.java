package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

import de.fourteen.funktionaleprogrammierunginjava.comparison.Console;

final class AreaFactoryImpl implements AreaFactory {

    private final Console console;

    AreaFactoryImpl(final Console console) {
        this.console = console;
    }

    @Override
    public Area create(double area) {
        return new AreaImpl(console, area);
    }
}