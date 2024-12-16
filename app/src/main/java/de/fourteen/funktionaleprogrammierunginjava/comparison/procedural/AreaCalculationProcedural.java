package de.fourteen.funktionaleprogrammierunginjava.comparison.procedural;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.comparison.Console;

final class AreaCalculationProcedural implements AreaCalculation {

    private final Console console;

    AreaCalculationProcedural(final Console console) {
        this.console = console;
    }

    @Override
    public void printCalculatedArea(final String[] input) {
        if ("rectangle".equals(input[0])) {
            double width = Double.parseDouble(input[1]);
            double height = Double.parseDouble(input[2]);
            double area = width * height;
            console.println("Area: " + area);
        } else if ("square".equals(input[0])) {
            double length = Double.parseDouble(input[1]);
            double area = length * length;
            console.println("Area: " + area);
        } else if ("circle".equals(input[0])) {
            double radius = Double.parseDouble(input[1]);
            double area = radius * radius * Math.PI;
            console.println("Area: " + area);
        }
    }
}
