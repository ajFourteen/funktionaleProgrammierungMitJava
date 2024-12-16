package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations;

import com.google.inject.Inject;
import de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging.Logger;

final class AdditionImpl implements Addition {

    private final Logger logger;

    @Inject
    AdditionImpl(final Logger logger) {
        this.logger = logger;
    }

    @Override
    public double sum(final double a, final double b) {
        return LoggedAddition.loggedSum.apply(logger).apply(a).apply(b);
    }
}
