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
        double area;
        switch (input[0]) {
            case "rectangle":
                double width = Double.parseDouble(input[1]);
                double height = Double.parseDouble(input[2]);
                area = width * height;
                break;
            case "square":
                double length = Double.parseDouble(input[1]);
                area = length * length;
                break;
            case "circle":
                double radius = Double.parseDouble(input[1]);
                area = radius * radius * Math.PI;
                break;
            default:
                throw new IllegalArgumentException("no such shape");
        }
        String output = "Area: " + area;
        console.println(output);
    }
}