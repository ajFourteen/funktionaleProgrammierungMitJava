package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection;

import de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations.Addition;

import static de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.Injector.injector;

final class Main {

    public static void main(String[] args) {
        Addition addition = injector().getInstance(Addition.class);
        double sum = addition.sum(40.0, 2.0);
    }
}
