package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

final class Circle implements Shape {
    private final AreaFactory areaFactory;
    private double radius;

    Circle(final AreaFactory areaFactory, final double radius) {
        this.areaFactory = areaFactory;
        this.radius = radius;
    }

    @Override
    public Area area() {
        return areaFactory.create(radius * radius * Math.PI);
    }
}
