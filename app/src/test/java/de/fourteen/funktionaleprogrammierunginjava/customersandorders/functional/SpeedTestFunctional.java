package de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional.CustomersWithMostOrders.customersWithMostOrders;
import static org.assertj.core.api.Assertions.assertThat;

final class SpeedTestFunctional {

    @Test
    void fiveUsersWithTenOrdersInTotal_aSingleCustomerWithMostOrders() {
        Customer customerWithMostOrders = new Customer(3, 3);
        Collection<Customer> customerRepository = List.of(
                new Customer(0, 2),
                new Customer(1, 2),
                new Customer(2, 1),
                customerWithMostOrders,
                new Customer(4, 2));

        Collection<Customer> result =
                customersWithMostOrders.apply(customerRepository);

        assertThat(result).containsExactly(customerWithMostOrders);
    }
}
