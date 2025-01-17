package de.fourteen.funktionaleprogrammierunginjava.numbermapping;

import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

final class InsteadDoThis {
    public static void main(String[] args) {
        Map<Integer, String> representations = ofEntries(
                entry(1, "one"),
                entry(2, "two"));

        Consumer<Map<Integer, String>> printFirstThreeIntegers = map -> Stream.of(1, 2, 3)
                .map(map::get)
                .forEach(System.out::println);

        printFirstThreeIntegers.accept(representations);

        representations = ofEntries(
                entry(1, "one"),
                entry(2, "two"),
                entry(3, "three"));

        printFirstThreeIntegers.accept(representations);
    }
}
