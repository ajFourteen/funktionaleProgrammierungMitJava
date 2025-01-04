package de.fourteen.funktionaleprogrammierunginjava.areacalculation.functional;

import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculationTest;
import org.junit.jupiter.api.BeforeEach;

import java.util.function.BiFunction;

final class AreaCalculationFunctionalTest implements AreaCalculationTest {

    private AreaCalculationFunctional sut;

    @BeforeEach
    void setUp() {
        sut = AreaCalculationFunctional.calculatedArea;
    }

    @Override
    public BiFunction<String, Double[], Double> sut() {
        return sut;
    }
}