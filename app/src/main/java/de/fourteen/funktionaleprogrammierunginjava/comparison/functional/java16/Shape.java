package de.fourteen.funktionaleprogrammierunginjava.comparison.functional.java16;

interface Shape {
}

record Rectangle(double width, double height) implements Shape {
}

record Square(double length) implements Shape {
}

record Circle(double radius) implements Shape {
}