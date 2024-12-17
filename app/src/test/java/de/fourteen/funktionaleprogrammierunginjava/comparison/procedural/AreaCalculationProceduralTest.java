package de.fourteen.funktionaleprogrammierunginjava.comparison.procedural;

import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculation;
import de.fourteen.funktionaleprogrammierunginjava.comparison.AreaCalculationTest;
import de.fourteen.funktionaleprogrammierunginjava.comparison.ConsoleSpy;
import org.junit.jupiter.api.BeforeEach;

final class AreaCalculationProceduralTest implements AreaCalculationTest {

    private ConsoleSpy consoleSpy;
    private AreaCalculationProcedural sut;

    @BeforeEach
    void setUp() {
        consoleSpy = new ConsoleSpy();
        sut = new AreaCalculationProcedural(consoleSpy);
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