package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java8;

import java.util.Arrays;

interface StringArrayUtils {

    static String[] rest(String[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length);
    }
}
