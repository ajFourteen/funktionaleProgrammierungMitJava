package de.fourteen.funktionaleprogrammierunginjava.customersandorders.objectoriented;

import java.util.ArrayList;
import java.util.Collection;

final class VerySlowOrderRepository {

    private final Collection<Order> allOrders;

    VerySlowOrderRepository(final Collection<Order> allOrders) {
        this.allOrders = allOrders;
    }

    VerySlowOrderRepository() {
        this(new ArrayList<>());
    }

    void addOrder(final Order order) {
        allOrders.add(order);
    }

    void addAllOrders(final Order... orders) {
        for (Order order : orders) {
            addOrder(order);
        }
    }

    NumberOfOrders numberOfOrdersByCustomer(final CustomerId customerId) {
        NumberOfOrders numberOfOrdersByCustomer = new NumberOfOrders(0);
        for (Order order : allOrders) {
            if (order.wasPlacedBy(customerId)) {
                numberOfOrdersByCustomer = numberOfOrdersByCustomer.increased();
            }
        }
        return numberOfOrdersByCustomer;
    }
}
