package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java22;

sealed interface Shape permits Rectangle, Square, Circle, NoSuchShape {
}

record Rectangle(double width, double height) implements Shape {
}

record Square(double length) implements Shape {
}

record Circle(double radius) implements Shape {
}

record NoSuchShape() implements Shape {
}