package com.example.java_hw8.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int age, String feathersColor) {
        super(name, age, feathersColor);
    }
    private static final String PENGUIN_KEY = "Penguin ";

    @Override
    public void makeSound() {
        System.out.println(PENGUIN_KEY + name + " is making sound.");
    }
    @Override
    public void move() {
        System.out.println(PENGUIN_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(PENGUIN_KEY + name + " is swimming.");
    }
    @Override
    public void flee() {
        System.out.println(PENGUIN_KEY + name + " is fleeing.");
    }
    @Override
    public void hunt() {
        System.out.println(PENGUIN_KEY + name + " is hunting.");
    }
}