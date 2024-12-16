package de.fourteen.funktionaleprogrammierunginjava.parallel;

import de.fourteen.funktionaleprogrammierunginjava.parallel.InputData;
import de.fourteen.funktionaleprogrammierunginjava.parallel.OutputData;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static de.fourteen.funktionaleprogrammierunginjava.parallel.DataProcessing.process;
import static org.assertj.core.api.Assertions.assertThat;

final class StreamSpeedTest {

    @Test
    void sequential() {
        Stream<InputData> inputDataStream = Stream.of(1, 2, 3).map(InputData::new);

        Stream<OutputData> actual = inputDataStream.map(process);

        assertThat(actual).containsExactly(new OutputData(1), new OutputData(4), new OutputData(9));
    }

    @Test
    void parallel() {
        Stream<InputData> inputDataStream = Stream.of(1, 2, 3).map(InputData::new);

        Stream<OutputData> actual = inputDataStream
                .parallel()
                .map(process);

        assertThat(actual).containsExactly(new OutputData(1), new OutputData(4), new OutputData(9));
    }
}
