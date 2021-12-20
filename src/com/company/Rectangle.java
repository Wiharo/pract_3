package com.company;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, Boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2.0D * (this.length + this.width);
    }

    public String toString() {
        double var10000 = this.width;
        return "Shape: rectangle, width: " + var10000 + ", lenght: " + this.length + ", color: " + this.color + ", perimeter: " + this.getPerimeter() + ", area: " + this.getArea();
    }
}
