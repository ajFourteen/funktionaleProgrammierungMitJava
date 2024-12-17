package de.fourteen.funktionaleprogrammierunginjava.areacalculation.procedural;

import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.areacalculation.AreaCalculationTest;
import org.junit.jupiter.api.BeforeEach;

final class AreaCalculationProceduralTest implements AreaCalculationTest {

    private AreaCalculationProcedural sut;

    @BeforeEach
    void setUp() {
        sut = new AreaCalculationProcedural();
    }

    @Override
    public AreaCalculation sut() {
        return sut;
    }
}