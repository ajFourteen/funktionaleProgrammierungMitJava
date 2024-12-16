package de.fourteen.funktionaleprogrammierunginjava.forms.methodrefernces;

public final class Methods {

    private int x;

    Methods(int x) {
        this.x = x;
    }

    static Methods someStaticMethod(Methods obj) {
        return new Methods(obj.x * 2);
    }

    void someObjectMethod() {
        System.out.println(x);
    }
}
