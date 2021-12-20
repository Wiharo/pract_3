package com.company;

public abstract class Shape {
    protected Boolean filled;
    protected String color;

    public Shape() {
    }

    public Shape(Boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public Boolean isFilled() {
        return this.filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return " ";
    }
}
