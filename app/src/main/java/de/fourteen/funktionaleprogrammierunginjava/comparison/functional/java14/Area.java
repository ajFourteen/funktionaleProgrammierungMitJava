package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Area {

    BiFunction<Double, Double, Double> areaOfRectangle = (width, height) -> width * height;

    Function<Double, Double> areaOfSquare = length -> length * length;

    Function<Double, Double> areaOfCircle = radius -> radius * radius * Math.PI;

    BiFunction<String, List<Double>, Double> area = (shape, params) ->
            switch (shape) {
                case "rectangle" -> areaOfRectangle.apply(params.get(0), params.get(1));
                case "square" -> areaOfSquare.apply(params.get(0));
                case "circle" -> areaOfCircle.apply(params.get(0));
                default -> throw new IllegalArgumentException("No such shape");
            };
}
