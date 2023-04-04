package com.example.java_hw8.Bird;

public class Dove extends Bird implements Flying{
    public Dove (String name, int age, String feathersColor) {
        super(name, age, feathersColor);
    }
    private static final String DOVE_KEY = "Dove ";
    @Override
    public void makeSound() {
        System.out.println(DOVE_KEY + name + " is making sound.");
    }
    @Override
    public void move() {
        System.out.println(DOVE_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(DOVE_KEY + name + " cannot swimming.");
    }
    @Override
    public void flee() {
        System.out.println(DOVE_KEY + name + " is fleeing.");
    }
    @Override
    public void hunt() {
        System.out.println(DOVE_KEY + name + " is hunting.");
    }
    @Override
    public void Fly() {
        System.out.println(DOVE_KEY + name + " is flying.");
    }
}