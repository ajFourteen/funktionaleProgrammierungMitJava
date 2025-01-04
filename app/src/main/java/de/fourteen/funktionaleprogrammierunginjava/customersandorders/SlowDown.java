package de.fourteen.funktionaleprogrammierunginjava.customersandorders;

public final class SlowDown {
    public static void slowDown() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
