package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import static de.fourteen.funktionaleprogrammierunginjava.customersandorders.SlowDown.slowDown;

final class Order {
    private final CustomerId customerId;

    Order(final CustomerId customerId) {
        this.customerId = customerId;
    }

    boolean wasPlacedBy(CustomerId customerId) {
        slowDown();
        return this.customerId.equals(customerId);
    }
}
