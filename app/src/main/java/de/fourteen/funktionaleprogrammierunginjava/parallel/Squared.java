package de.fourteen.funktionaleprogrammierunginjava.parallel;

import java.util.function.Function;

interface Squared {

    Function<Integer, Integer> squared = n -> {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return n * n;
    };
}