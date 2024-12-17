package de.fourteen.funktionaleprogrammierunginjava.areacalculation;

@FunctionalInterface
public interface AreaCalculation {

    /**
     * <pre>
     * Calculates the area of the given shape.
     *
     * The first element of the input must be "rectangle", "square" or "circle",
     * followed by additional parameters to configure the size.
     * </pre>
     *
     * @param input [shape, params...]
     */
    double calculateArea(String[] input);
}