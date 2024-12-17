package de.fourteen.funktionaleprogrammierunginjava.areacalculation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public interface AreaCalculationTest {

    AreaCalculation sut();

    @Test
    default void rectangle() {
        String[] input = new String[]{"rectangle", "3", "4"};

        double actualArea = sut().calculateArea(input);

        assertThat(actualArea).isEqualTo(12);
    }

    @Test
    default void square() {
        String[] input = new String[]{"square", "2"};

        double actualArea = sut().calculateArea(input);

        assertThat(actualArea).isEqualTo(4);
    }

    @Test
    default void circle() {
        String[] input = new String[]{"circle", "2"};

        double actualArea = sut().calculateArea(input);

        assertThat(actualArea).isEqualTo(12.566370614359172);
    }
}