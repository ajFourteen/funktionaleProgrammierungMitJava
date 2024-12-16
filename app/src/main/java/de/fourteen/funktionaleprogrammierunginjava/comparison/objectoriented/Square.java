package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

final class Square implements Shape {
    private final AreaFactory areaFactory;

    private double length;

    Square(final AreaFactory areaFactory, final double length) {
        this.areaFactory = areaFactory;
        this.length = length;
    }

    @Override
    public Area area() {
        return areaFactory.create(length * length);
    }
}
