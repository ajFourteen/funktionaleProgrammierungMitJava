package de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional;

import java.util.Collection;

record Tuple(Collection<Customer> customers, Long numberOfOrders) {
}
