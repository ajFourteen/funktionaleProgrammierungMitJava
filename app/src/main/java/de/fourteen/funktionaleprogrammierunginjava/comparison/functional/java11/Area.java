package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java11;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Area {

    BiFunction<Double, Double, Double> areaOfRectangle = (Double width, Double height) -> width * height;

    Function<Double, Double> areaOfSquare = (Double length) -> length * length;

    Function<Double, Double> areaOfCircle = (Double radius) -> radius * radius * Math.PI;

    BiFunction<String, List<Double>, Double> area = (shape, params) -> {
        switch (shape) {
            case "rectangle":
                return areaOfRectangle.apply(params.get(0), params.get(1));
            case "square":
                return areaOfSquare.apply(params.get(0));
            case "circle":
                return areaOfCircle.apply(params.get(0));
            default:
                throw new IllegalArgumentException("No such shape");
        }
    };
}
