package com.example.java_hw7;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double base, double side) {
        super(base, side, side);
    }

    @Override
    public double getArea() {
        double height = Math.sqrt(getSide2()*getSide2() - (getSide1()*getSide1())/4);
        return getSide1() * height / 2;
    }
}
