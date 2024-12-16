package de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance;

import com.google.inject.Binder;
import com.google.inject.Module;

import static de.fourteen.funktionaleprogrammierunginjava.dont.mix.fpinoop.better.distance.ClosestDistanceTo42AfterSquaredCalculationImpl.closestDistanceTo42AfterSquared;

final class DistanceBindingModule implements Module {
    @Override
    public void configure(final Binder binder) {
        binder.bind(ClosestDistanceTo42AfterSquaredCalculation.class).toInstance(closestDistanceTo42AfterSquared);
    }
}
