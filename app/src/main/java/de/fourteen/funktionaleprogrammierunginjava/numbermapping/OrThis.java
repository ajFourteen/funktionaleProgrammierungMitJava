package de.fourteen.funktionaleprogrammierunginjava.numbermapping;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

final class OrThis {
    public static void main(String[] args) {
        Function<Integer, String> representations = number -> switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            default -> null;
        };

        Consumer<Function<Integer, String>> printFirstThreeIntegers = toRepresentation -> Stream.of(1, 2, 3)
                .map(toRepresentation)
                .forEach(System.out::println);

        printFirstThreeIntegers.accept(representations);

        representations = number -> switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> null;
        };

        printFirstThreeIntegers.accept(representations);
    }
}
