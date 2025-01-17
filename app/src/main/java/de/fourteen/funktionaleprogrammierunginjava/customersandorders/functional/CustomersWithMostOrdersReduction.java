package de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional;

import java.util.function.BinaryOperator;

import static de.fourteen.funktionaleprogrammierunginjava.customersandorders.functional.CombinedCustomerCollection.combined;

interface CustomersWithMostOrdersReduction extends BinaryOperator<Tuple> {
    CustomersWithMostOrdersReduction toCustomersWithMostOrders =
            (tuple1, tuple2) ->
                    tuple1.numberOfOrders() > tuple2.numberOfOrders() ?
                            tuple1 :
                            tuple2.numberOfOrders() > tuple1.numberOfOrders() ?
                                    tuple2 :
                                    new Tuple(
                                            combined.apply(tuple1.customers()).apply(tuple2.customers()),
                                            tuple1.numberOfOrders()
                                    );
}
