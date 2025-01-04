package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

final class SpeedTest {

    @Test
    void fiveUsersWithTenOrdersInTotal() {
        VerySlowOrderRepository orderRepository = new VerySlowOrderRepository();
        VerySlowCustomerRepository customerRepository = new VerySlowCustomerRepository(orderRepository);
        CustomerId customerId0 = new CustomerId(0);
        CustomerId customerId1 = new CustomerId(1);
        CustomerId customerId2 = new CustomerId(2);
        CustomerId customerId3 = new CustomerId(3);
        CustomerId customerId4 = new CustomerId(4);
        Customer customerWithMostOrders = new Customer(customerId3);
        customerRepository.addAllCustomers(
                new Customer(customerId0),
                new Customer(customerId1),
                new Customer(customerId2),
                customerWithMostOrders,
                new Customer(customerId4));
        orderRepository.addAllOrders(
                new Order(customerId0),
                new Order(customerId0),
                new Order(customerId1),
                new Order(customerId1),
                new Order(customerId2),
                new Order(customerId3),
                new Order(customerId3),
                new Order(customerId3),
                new Order(customerId4),
                new Order(customerId4));

        Collection<Customer> result = customerRepository.customersWithMostOrders();

        assertThat(result).containsExactly(customerWithMostOrders);
    }
}
