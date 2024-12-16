package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java14;

import java.util.Arrays;
import java.util.function.Function;

interface StringArray {
    Function<String[], String[]> rest = array -> Arrays.copyOfRange(array, 1, array.length);
}