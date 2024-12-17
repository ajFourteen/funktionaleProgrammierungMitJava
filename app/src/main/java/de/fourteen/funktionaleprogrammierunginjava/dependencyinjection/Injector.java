package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection;

import com.google.inject.Guice;
import de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations.CalculationsBindingModule;
import de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging.LoggingBindingModule;

public final class Injector {
    public static com.google.inject.Injector injector() {
        return Guice.createInjector(new LoggingBindingModule(), new CalculationsBindingModule());
    }
}