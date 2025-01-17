package de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;

interface CombinedCustomerCollection extends Function<Collection<Customer>, Function<Collection<Customer>, Collection<Customer>>> {
    CombinedCustomerCollection combined = c1 -> c2 -> Stream.concat(c1.stream(), c2.stream()).toList();
}
