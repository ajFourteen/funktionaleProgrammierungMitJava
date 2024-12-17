package de.fourteen.funktionaleprogrammierunginjava.areacalculation.procedural;

import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculation;

final class AreaCalculationProcedural implements AreaCalculation {

    @Override
    public double calculateArea(final String[] input) {
        switch (input[0]) {
            case "rectangle":
                double width = Double.parseDouble(input[1]);
                double height = Double.parseDouble(input[2]);
                return width * height;
            case "square":
                double length = Double.parseDouble(input[1]);
                return length * length;
            case "circle":
                double radius = Double.parseDouble(input[1]);
                return radius * radius * Math.PI;
            default:
                throw new IllegalArgumentException("no such shape");
        }
    }
}