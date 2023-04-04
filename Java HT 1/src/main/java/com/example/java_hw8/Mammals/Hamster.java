package com.example.java_hw8.Mammals;

class Hamster extends Mammals implements Runner {
    public Hamster(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Hamster " + name + "Squeak");
    }
    @Override
    public void swim() {
        System.out.println("Hamster " + name + " swimming");
    }
    @Override
    public void move() {
        System.out.println("Hamster " + name + " can move fast");
    }

    @Override
    public void run() {
        System.out.println("Hamster " + name + " is running.");
    }

    @Override
    public void hunt() {
        System.out.println("Hamster " + name + " is not hunting.");
    }

    @Override
    public void flee() {
        System.out.println("Hamster " + name + " is fleeing.");
    }
}
