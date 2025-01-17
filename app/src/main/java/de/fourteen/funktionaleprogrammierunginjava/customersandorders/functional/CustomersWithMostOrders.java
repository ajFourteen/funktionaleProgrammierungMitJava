package de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import static de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional.CustomersWithMostOrdersReduction.toCustomersWithMostOrders;

interface CustomersWithMostOrders
        extends Function<Collection<Customer>, Collection<Customer>> {
    CustomersWithMostOrders customersWithMostOrders = allCustomers ->
            allCustomers
                    .stream()
                    .parallel()
                    .map(customer ->
                            new Tuple(List.of(customer), customer.numberOfOrders()))
                    .reduce(toCustomersWithMostOrders)
                    .map(Tuple::customers)
                    .orElse(List.of());
}
