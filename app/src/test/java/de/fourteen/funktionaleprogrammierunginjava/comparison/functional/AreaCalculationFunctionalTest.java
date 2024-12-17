package de.fourteen.funktionaleprogrammierunginjava.comparison.functional;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculationTest;
import de.fourteen.funktionaleprogrammierunginjava.comparison.ConsoleSpy;
import org.junit.jupiter.api.BeforeEach;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.AreaCalculationFunctional.areaCalculationFunctionalCreation;

final class AreaCalculationFunctionalTest implements AreaCalculationTest {

    private ConsoleSpy consoleSpy;
    private AreaCalculationFunctional sut;

    @BeforeEach
    void setUp() {
        consoleSpy = new ConsoleSpy();
        sut = areaCalculationFunctionalCreation.apply(consoleSpy::println);
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