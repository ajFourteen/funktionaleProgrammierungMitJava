package de.fourteen.funktionaleprogrammierunginjava.forms;

import static de.fourteen.funktionaleprogrammierunginjava.forms.SomeLambda.doSomething;

final class Usage {

    void use() {
        SomeFunctionalInterface implementation = new SomeImplementation();

        SomeFunctionalInterface staticFunction = SomeStaticFunction::doSomething;

        SomeObject someObject = new SomeObject();
        SomeFunctionalInterface nonStaticFunction = someObject::doSomething;

        SomeFunctionalInterface staticConstant = doSomething;
        staticConstant = SomeLambda.doSomething;

        SomeFunctionalInterface anonymousClass = new SomeFunctionalInterface() {
            @Override
            public void doSomething() {
                // ...
            }
        };

        SomeFunctionalInterface lambda = () -> {
            // ...
        };
    }
}
