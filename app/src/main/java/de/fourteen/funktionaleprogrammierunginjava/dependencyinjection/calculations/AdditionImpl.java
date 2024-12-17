package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations;

import com.google.inject.Inject;
import de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.logging.Logging;

import static de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations.LoggedAddition.loggedSum;

final class AdditionImpl implements Addition {

    private final Logging logging;

    @Inject
    AdditionImpl(final Logging logging) {
        this.logging = logging;
    }

    @Override
    public double sum(final double a, final double b) {
        return loggedSum.apply(logging::logged).apply(a).apply(b);
    }
}