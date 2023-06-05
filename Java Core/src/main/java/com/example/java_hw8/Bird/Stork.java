package com.example.java_hw8.Bird;

public class Stork extends Bird implements Flying {
    public Stork (String name, int age, String feathersColor) {
        super(name, age, feathersColor);
    }
    private static final String STORK_KEY = "Stork ";

    @Override
    public void makeSound() {
        System.out.println(STORK_KEY + name + " is making sound.");
    }
    @Override
    public void move() {
        System.out.println(STORK_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(STORK_KEY + name + " is swimming.");
    }
    @Override
    public void flee() {
        System.out.println(STORK_KEY + name + " is fleeing.");
    }
    @Override
    public void hunt() {
        System.out.println(STORK_KEY + name + " is hunting.");
    }
    @Override
    public void Fly() {
        System.out.println(STORK_KEY + name + " is flying.");
    }
}