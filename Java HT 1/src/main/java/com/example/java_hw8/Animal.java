package com.example.java_hw8;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    public abstract void move();
    public abstract void swim();
}
