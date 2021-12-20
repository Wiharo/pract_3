package com.company;

public class Square extends Rectangle {
    protected double side;

    Square() {
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, Boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public String toString() {
        this.setLength(this.side);
        this.setWidth(this.side);
        double var10000 = this.side;
        return "Shape: square, side: " + var10000 + ", color: " + this.color + ", perimeter: " + this.getPerimeter() + ", area: " + this.getArea();
    }
}
