package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import java.util.Objects;

final class CustomerId {

    private final int customerId;

    CustomerId(final int customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerId customerId1 = (CustomerId) o;
        return customerId == customerId1.customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(customerId);
    }
}
