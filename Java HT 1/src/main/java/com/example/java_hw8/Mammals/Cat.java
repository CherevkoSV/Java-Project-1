package com.example.java_hw8.Mammals;

class Cat extends Mammals implements Scratchable {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name +  "Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat " + name +   " can move fast");
    }

    @Override
    public void swim() {
        System.out.println("Cat " + name +  " is swimming.");
    }

    @Override
    public void scratch() {
        System.out.println("Cat " + name +  " is scratching.");
    }

    @Override
    public void hunt() {
        System.out.println("Cat " + name +  " is hunting.");
    }

    @Override
    public void flee() {
        System.out.println("Cat " + name +  " is fleeing.");
    }
}
