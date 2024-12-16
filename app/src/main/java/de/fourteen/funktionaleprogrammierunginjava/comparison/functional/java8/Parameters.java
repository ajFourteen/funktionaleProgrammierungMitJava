package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8.StringArray.rest;

interface Parameters {
    Function<String[], List<Double>> parameters = (String[] params) ->
            Stream.of(rest.apply(params))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
}
