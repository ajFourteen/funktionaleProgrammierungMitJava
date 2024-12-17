package de.fourteen.funktionaleprogrammierunginjava.parallel;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static de.fourteen.funktionaleprogrammierunginjava.parallel.Squared.squared;
import static org.assertj.core.api.Assertions.assertThat;

final class StreamSpeedTest {

    @Test
    void sequential() {
        Stream<Integer> inputDataStream = Stream.of(1, 2, 3);

        Stream<Integer> actual = inputDataStream.map(squared);

        assertThat(actual).containsExactly(1, 4, 9);
    }

    @Test
    void parallel() {
        Stream<Integer> inputDataStream = Stream.of(1, 2, 3);

        Stream<Integer> actual = inputDataStream.parallel().map(squared);

        assertThat(actual).containsExactly(1, 4, 9);
    }
}