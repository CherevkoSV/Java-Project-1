package com.example.java_hw8.Mammals;
import com.example.java_hw8.Animal;
import com.example.java_hw8.Predator;
import com.example.java_hw8.Prey;

abstract class Mammals extends Animal implements Predator, Prey {
    public Mammals (String name, int age) {
        super(name, age);
    }
}
