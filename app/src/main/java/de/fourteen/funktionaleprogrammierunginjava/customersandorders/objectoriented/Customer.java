package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import java.util.Objects;

final class Customer {
    private final CustomerId id;

    Customer(final CustomerId id) {
        this.id = id;
    }

    CustomerId id() {
        return id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
