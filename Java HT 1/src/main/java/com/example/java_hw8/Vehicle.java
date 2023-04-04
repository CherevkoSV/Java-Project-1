package com.example.java_hw8;

public abstract class Vehicle {
    protected String name;
    protected double speed;
    protected int capacity;

    public Vehicle(String name, double speed, int capacity) {
        this.name = name;
        this.speed = speed;
        this.capacity = capacity;
    }

    public abstract void accelerate();
    public abstract void decelerate();
    public abstract void start();
    public abstract void stop();
}
