package de.fourteen.funktionaleprogrammierunginjava.comparison;

import java.util.ArrayList;
import java.util.Collection;

public final class ConsoleSpy implements Console {

    private final Collection<String> printedOutput = new ArrayList<>();

    @Override
    public void println(final String output) {
        printedOutput.add(output);
    }

    Collection<String> printedOutput() {
        return printedOutput;
    }
}