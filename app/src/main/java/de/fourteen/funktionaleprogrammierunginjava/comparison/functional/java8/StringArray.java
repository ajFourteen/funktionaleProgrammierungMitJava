package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8;

import java.util.Arrays;
import java.util.function.Function;

interface StringArray {
    Function<String[], String[]> rest = (String[] arr) -> Arrays.copyOfRange(arr, 1, arr.length);
}