package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java21;

sealed interface Shape permits Rectangle, Square, Circle {
}

record Rectangle(double width, double height) implements Shape {
}

record Square(double length) implements Shape {
}

record Circle(double radius) implements Shape {
}