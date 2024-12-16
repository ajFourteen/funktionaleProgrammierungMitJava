package de.fourteen.funktionaleprogrammierunginjava.forms;

interface SomeFunctionalInterface {
    void doSomething();
}

class SomeImplementation implements SomeFunctionalInterface {
    @Override
    public void doSomething() {
        // ...
    }
}

class SomeObject {
    void doSomething() {
        // ...
    }
}

interface SomeStaticFunction {
    static void doSomething() {
        // ...
    }
}

interface SomeLambda {
    SomeFunctionalInterface doSomething = () -> {
        // ...
    };
}