package de.fourteen.funktionaleprogrammierunginjava.dependencyinjection.calculations;

import com.google.inject.Binder;
import com.google.inject.Module;

public final class CalculationsBindingModule implements Module {
    @Override
    public void configure(final Binder binder) {
        binder.bind(Addition.class).to(AdditionImpl.class);
    }
}