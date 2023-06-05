package com.example.java_hw8.Bird;
import com.example.java_hw8.Animal;
import com.example.java_hw8.Predator;
import com.example.java_hw8.Prey;

abstract class Bird extends Animal implements Predator, Prey {
    protected final String feathersColor;

    public Bird(String name, int age, String feathersColor) {
        super(name, age);
        this.feathersColor = feathersColor;
    }
}
