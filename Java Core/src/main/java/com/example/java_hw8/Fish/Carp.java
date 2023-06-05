package com.example.java_hw8.Fish;
import com.example.java_hw8.Animal;

class Carp extends Fish implements Edible, SurfaceSwimmer {

    private static final String CARP_KEY = "Carp ";

    public Carp(String name, int length, int age) {
        super(name, length, age);
    }

    @Override
    public void makeSound() {
        System.out.println(CARP_KEY + name + " is silent.");
    }
    @Override
    public void move() {
        System.out.println(CARP_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(CARP_KEY + name + " is swimming.");
    }

    @Override
    public void eat() {
        System.out.println(CARP_KEY + name + " is being eaten.");
    }
    @Override
    public void swimToSurface() {
        System.out.println(CARP_KEY + name + " is swimming to the surface.");
    }
    @Override
    public void flee() {
        System.out.println(CARP_KEY + name + " is fleeing.");
    }

    @Override
    public void hunt() {
        System.out.println(CARP_KEY + name + " is not hunting.");
    }
}
