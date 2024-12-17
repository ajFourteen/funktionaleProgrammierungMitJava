package de.fourteen.funktionaleprogrammierunginjava.forms;

@FunctionalInterface
interface SomeFunctionalInterface {
    void doSomething();
}

class SomeImplementationClass implements SomeFunctionalInterface {
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