package de.fourteen.funktionaleprogrammierunginjava.parallel;

import java.util.function.Function;

interface DataProcessing {

    Function<InputData, OutputData> process = (InputData input) -> {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new OutputData(input.n() * input.n());
    };
}
