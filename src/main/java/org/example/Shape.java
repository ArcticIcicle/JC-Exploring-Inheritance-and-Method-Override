package org.example;

// Abstract parent class
abstract class Shape {
    // Abstract method
    public abstract double area();

    // Concrete method
    public String display() {
        return "The area is: " + area();
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius = 5.0;

    // implementation for abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length = 4.0;
    private double width = 6.0;

    // implementation for abstract method
    public double area() {
        return length * width;
    }
}
