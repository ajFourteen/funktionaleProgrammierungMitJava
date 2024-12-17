package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculationTest;
import org.junit.jupiter.api.BeforeEach;

import static de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional.CalculateArea.calculateArea;

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