package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

import de.fourteen.funktionaleprogrammierunginjava.comparison.Console;

final class AreaImpl implements Area {

    private final Console console;

    private double area;

    AreaImpl(final Console console, final double area) {
        this.console = console;
        this.area = area;
    }

    @Override
    public void print() {
        console.println("Area: " + area);
    }
}
