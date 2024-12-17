package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging;

import com.google.inject.Binder;
import com.google.inject.Module;

import static de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging.FunctionalLogger.loggedToConsole;

public final class LoggingBindingModule implements Module {
    @Override
    public void configure(final Binder binder) {
        binder.bind(Logging.class).toInstance(loggedToConsole);

//        binder.bind(Logging.class).toInstance(new ElegantLogger());

//        binder.bind(Logging.class).to(ObjectorientedLogger.class);

//        binder.bind(PrintLn.class).toInstance(System.out::println);
    }
}