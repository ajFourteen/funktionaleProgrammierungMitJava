package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

final class ShapeFactoryImpl implements ShapeFactory {

    private final AreaFactory areaFactory;

    ShapeFactoryImpl(final AreaFactory areaFactory) {
        this.areaFactory = areaFactory;
    }

    @Override
    public Shape create(final String[] input) {
        switch (input[0]) {
            case "rectangle":
                return new Rectangle(areaFactory, Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            case "square":
                return new Square(areaFactory, Double.parseDouble(input[1]));
            case "circle":
                return new Circle(areaFactory, Double.parseDouble(input[1]));
            default:
                throw new IllegalArgumentException("No such shape");
        }
    }
}
