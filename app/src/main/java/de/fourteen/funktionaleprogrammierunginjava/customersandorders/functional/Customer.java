package de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional;

import static de.fourteen.funktionaleprogrammierunginjava.customersandorders.SlowDown.slowDown;

record Customer(int id, long numberOfOrders) {
    @Override
    public long numberOfOrders() {
        slowDown();
        return numberOfOrders;
    }
}
