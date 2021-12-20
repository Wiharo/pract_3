package com.company;

public class TestShape {
    public TestShape() {
    }

    public static void main(String[] args) {
        Shape[] arr = new Shape[]{new Circle(8.0D, true, "yellow"), new Rectangle(4.0D, 7.0D, "pink", false), new Square(16.0D, "white", true), new Square(2.0D, "green", true)};
        Shape[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Shape shape = var2[var4];
            System.out.println(shape);
        }

    }
}
