package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class VerySlowCustomerRepository {

    private final Collection<Customer> allCustomers;
    private final VerySlowOrderRepository orderRepository;

    VerySlowCustomerRepository(final Collection<Customer> allCustomers, final VerySlowOrderRepository orderRepository) {
        this.allCustomers = allCustomers;
        this.orderRepository = orderRepository;
    }

    VerySlowCustomerRepository(final VerySlowOrderRepository orderRepository) {
        this(new ArrayList<>(), orderRepository);
    }

    void addCustomer(final Customer customer) {
        allCustomers.add(customer);
    }

    void addAllCustomers(final Customer... customers) {
        for (Customer customer : customers) {
            addCustomer(customer);
        }
    }

    Collection<Customer> customersWithMostOrders() {
        Collection<Customer> customersWithMostOrders = new ArrayList<>();
        NumberOfOrders mostOrders = new NumberOfOrders(0);
        for (Customer customer : allCustomers) {
            NumberOfOrders numberOfOrdersByThisCustomer = orderRepository.numberOfOrdersByCustomer(customer.id());
            if (numberOfOrdersByThisCustomer.isGreaterThan(mostOrders)) {
                customersWithMostOrders = new ArrayList<>(List.of(customer));
                mostOrders = numberOfOrdersByThisCustomer;
            } else if (numberOfOrdersByThisCustomer.equals(mostOrders)) {
                customersWithMostOrders.add(customer);
            }
        }
        return customersWithMostOrders;
    }
}
