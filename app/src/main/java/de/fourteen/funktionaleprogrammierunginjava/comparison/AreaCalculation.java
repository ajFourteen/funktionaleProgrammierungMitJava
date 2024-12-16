package de.fourteen.funktionaleprogrammierunginjava.comparison;

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
    void printCalculatedArea(String[] input);
}
