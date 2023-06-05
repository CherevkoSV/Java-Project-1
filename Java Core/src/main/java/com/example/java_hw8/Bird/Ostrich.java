package com.example.java_hw8.Bird;

public class Ostrich extends Bird implements Pet  {
    public Ostrich(String name, int age, String feathersColor) {
        super(name, age, feathersColor);
    }
    private static final String OSTRICH_KEY = "Ostrich ";
    @Override
    public void makeSound() {
        System.out.println(OSTRICH_KEY + name + " is making sound.");
    }
    @Override
    public void move() {
        System.out.println(OSTRICH_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(OSTRICH_KEY + name + " cannot swimming.");
    }
    @Override
    public void flee() {
        System.out.println(OSTRICH_KEY + name + " is fleeing.");
    }
    @Override
    public void hunt() {
        System.out.println(OSTRICH_KEY + name + " is hunting.");
    }

    @Override
    public void HomePet() {
        System.out.println(OSTRICH_KEY + name + " is bred on a farm.");
    }
}