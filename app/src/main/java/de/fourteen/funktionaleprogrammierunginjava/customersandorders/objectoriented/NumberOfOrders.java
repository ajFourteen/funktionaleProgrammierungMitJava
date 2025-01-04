package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import java.util.Objects;

final class NumberOfOrders {

    private final int numberOfOrders;

    NumberOfOrders(final int numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    NumberOfOrders increased() {
        return new NumberOfOrders(numberOfOrders + 1);
    }

    boolean isGreaterThan(final NumberOfOrders other) {
        return this.numberOfOrders > other.numberOfOrders;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfOrders that = (NumberOfOrders) o;
        return numberOfOrders == that.numberOfOrders;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numberOfOrders);
    }
}
