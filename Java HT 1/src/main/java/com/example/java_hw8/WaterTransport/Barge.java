package com.example.java_hw8.WaterTransport;
import com.example.java_hw8.Navigate;
import com.example.java_hw8.Vehicle;

public class Barge extends Vehicle implements Water, Navigate {
    public Barge(String name, double speed, int capacity) {
        super(name, speed, capacity);
    }

    public void accelerate() {
        // Implement airplane-specific acceleration logic
    }

    public void decelerate() {
        // Implement airplane-specific deceleration logic
    }

    public void start() {
        // Implement airplane-specific starting logic
    }

    public void stop() {
        // Implement airplane-specific stopping logic
    }

    @Override
    public void WaterDrive() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
