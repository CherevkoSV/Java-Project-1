package com.example.java_hw8.Fish;
import com.example.java_hw8.Animal;
import com.example.java_hw8.Predator;
import com.example.java_hw8.Prey;

abstract class Fish extends Animal implements Predator, Prey {
    protected int length;

    public Fish (String name, int age, int length) {
        super(name, age);
        this.length = length;
    }
}
