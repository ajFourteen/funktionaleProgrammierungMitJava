package de.fourteen.funktionaleprogrammierunginjava.comparison;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public interface AreaCalculationTest {

    AreaCalculation sut();

    ConsoleSpy consoleSpy();

    @Test
    default void rectangle() {
        String[] input = new String[]{"rectangle", "3", "4"};
        sut().printCalculatedArea(input);
        assertThat(consoleSpy().printedOutput()).containsExactly("Area: 12.0");
    }

    @Test
    default void square() {
        String[] input = new String[]{"square", "2"};
        sut().printCalculatedArea(input);
        assertThat(consoleSpy().printedOutput()).containsExactly("Area: 4.0");
    }

    @Test
    default void circle() {
        String[] input = new String[]{"circle", "2"};
        sut().printCalculatedArea(input);
        assertThat(consoleSpy().printedOutput()).containsExactly("Area: 12.566370614359172");
    }
}