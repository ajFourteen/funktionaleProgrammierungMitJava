package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;

final class AreaCalculationObjectOriented implements AreaCalculation {

    private final ShapeFactory shapeFactory;

    AreaCalculationObjectOriented(final ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    @Override
    public void printCalculatedArea(final String[] input) {
        Shape shape = shapeFactory.create(input);
        Area area = shape.area();
        area.print();
    }
}