package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

final class Rectangle implements Shape {
    private final AreaFactory areaFactory;
    private double width;
    private double height;

    Rectangle(final AreaFactory areaFactory, final double width, final double height) {
        this.areaFactory = areaFactory;
        this.width = width;
        this.height = height;
    }

    @Override
    public Area area() {
        return areaFactory.create(width * height);
    }
}
