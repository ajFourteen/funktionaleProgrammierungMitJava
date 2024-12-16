package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculationTest;
import de.fourteen.funktionaleprogrammierunginjava.comparison.ConsoleSpy;
import org.junit.jupiter.api.BeforeEach;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8.AreaCalculationFunctional.areaCalculationFunctional;

final class AreaCalculationFunctionalTest implements AreaCalculationTest {

    private ConsoleSpy consoleSpy;
    private AreaCalculation sut;

    @BeforeEach
    void setUp() {
        consoleSpy = new ConsoleSpy();
        sut = areaCalculationFunctional(consoleSpy::println);
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
