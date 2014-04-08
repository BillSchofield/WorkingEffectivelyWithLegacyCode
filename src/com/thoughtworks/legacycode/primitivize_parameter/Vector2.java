package com.thoughtworks.legacycode.primitivize_parameter;


public class Vector2 {
    private double x;
    private double y;

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 average(Vector2 that) {
        return new Vector2(average(this.x, that.x), average(this.y, that.y));
    }

    private double average(double number1, double number2) {
        return (number1 + number2)/2;
    }
}
