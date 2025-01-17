package de.fourteen.funktionaleprogrammierunginjava.numbermapping;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

final class DoNotDoThis {
    public static void main(String[] args) {
        Map<Integer, String> representations = new HashMap<>(ofEntries(
                entry(1, "one"),
                entry(2, "two")));

        Runnable printFirstThreeIntegers = () -> Stream.of(1, 2, 3)
                .map(representations::get)
                .forEach(System.out::println);

        printFirstThreeIntegers.run();

        representations.put(3, "three");

        printFirstThreeIntegers.run();
    }
}
