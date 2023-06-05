package com.example.java_hw8.Mammals;

class Dog extends Mammals implements Scratchable, Guardable, Runner {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name +  "Woof");
    }
    @Override
    public void move() {
        System.out.println("Dog " + name +  " can move fast");
    }
    @Override
    public void swim() {
        System.out.println("Dog " + name +  " can swimming");
    }

    @Override
    public void guard() {
        System.out.println("Dog " + name + " is guarding.");
    }
    @Override
    public void run() {
        System.out.println("Dog " + name +  " is running.");
    }

    @Override
    public void scratch() {
        System.out.println("Dog " + name + " is scratching.");
    }
    @Override
    public void hunt() {
        System.out.println("Dog " + name + " is hunting.");
    }
    @Override
    public void flee() {
        System.out.println("Dog " + name + " is not flee.");
    }
}
