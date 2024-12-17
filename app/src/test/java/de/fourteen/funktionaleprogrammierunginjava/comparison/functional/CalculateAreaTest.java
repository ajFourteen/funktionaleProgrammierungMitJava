package de.fourteen.funktionaleprogrammierunginjava.comparison.functional;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculationTest;
import org.junit.jupiter.api.BeforeEach;

import static de.fourteen.funktionaleprogrammierunginjava.comparison.functional.CalculateArea.calculateArea;

final class CalculateAreaTest implements AreaCalculationTest {

    private CalculateArea sut;

    @BeforeEach
    void setUp() {
        sut = calculateArea;
    }

    @Override
    public AreaCalculation sut() {
        return sut;
    }
}