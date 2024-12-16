package de.fourteen.funktionaleprogrammierunginjava.comparison.objectoriented;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculationTest;
import de.fourteen.funktionaleprogrammierunginjava.comparison.ConsoleSpy;
import org.junit.jupiter.api.BeforeEach;

final class AreaCalculationObjectOrientedTest implements AreaCalculationTest {

    private ConsoleSpy consoleSpy;
    private AreaCalculationObjectOriented sut;

    @BeforeEach
    void setUp() {
        consoleSpy = new ConsoleSpy();
        sut = new AreaCalculationObjectOriented(new ShapeFactoryImpl(new AreaFactoryImpl(consoleSpy)));
    }

    @Override
    public AreaCalculation sut() {
        return sut;
    }

    @Override
    public ConsoleSpy consoleSpy() {
        return consoleSpy;
    }
}
