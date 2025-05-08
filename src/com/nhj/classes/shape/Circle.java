package com.nhj.classes.shape;

public class Circle implements Shape {
    private Point center;
    private double a;

    public Circle(Point center, double a) {
        this.center = center;
        this.a = a;
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * a;
    }

    @Override
    public Point[] getVertices() {
        return new Point[] { center };
    }

    @Override
    public void printName() {
        System.out.println("Circle");
    }
}