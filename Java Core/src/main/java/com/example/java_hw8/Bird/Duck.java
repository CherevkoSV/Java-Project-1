package com.example.java_hw8.Bird;

public class Duck extends Bird implements Flying, Pet {
    public Duck (String name, int age, String feathersColor) {
        super(name, age, feathersColor);
    }
    private static final String DUCK_KEY = "Duck ";
    @Override
    public void makeSound() {
        System.out.println(DUCK_KEY + name + " is making sound.");
    }
    @Override
    public void move() {
        System.out.println(DUCK_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(DUCK_KEY + name + " cannot swimming.");
    }
    @Override
    public void flee() {
        System.out.println(DUCK_KEY + name + " is fleeing.");
    }
    @Override
    public void hunt() {
        System.out.println(DUCK_KEY + name + " is hunting.");
    }

    @Override
    public void Fly() {
        System.out.println(DUCK_KEY + name + " is flying.");
    }
    @Override
    public void HomePet() {
        System.out.println(DUCK_KEY + name + " is bred on a farm.");
    }
}