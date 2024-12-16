package de.fourteen.funktionaleprogrammierunginjava.forms.methodrefernces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Usage {

    void main() {
        Stream.of(1, 2, 3)
                .map(Methods::new)
                .map(Methods::someStaticMethod)
                .forEach(Methods::someObjectMethod);

        Stream.of(1, 2, 3)
                .map(Methods::new)
                .map(m -> Methods.someStaticMethod(m))
                .forEach(m -> m.someObjectMethod());

        List<Integer> ints = new ArrayList<>();
        Stream.of(1, 2, 3).forEach(ints::add);
        Stream.of(1, 2, 3).forEach(i -> ints.add(i));
    }
}
