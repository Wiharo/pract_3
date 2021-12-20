package com.company;

public class Circle extends Shape {
    protected double radius;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, boolean filled, String color) {
        this.radius = radius;
        this.filled = filled;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 3.141592653589793D * this.radius * 2.0D;
    }

    public double getArea() {
        return 3.141592653589793D * Math.pow(this.radius, 2.0D);
    }

    public String toString() {
        double var10000 = this.radius;
        return "Shape: circle, radius: " + var10000 + ", color: " + this.color + ", perimeter: " + this.getPerimeter();
    }
}
