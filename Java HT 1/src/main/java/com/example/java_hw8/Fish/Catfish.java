package com.example.java_hw8.Fish;

class Catfish extends Fish implements Edible {
    public Catfish(String name, int length, int age) {
        super(name, length, age);
    }

    private static final String CATFISH_KEY = "Catfish ";

    @Override
    public void makeSound() {
        System.out.println(CATFISH_KEY + name + " is silent.");
    }
    @Override
    public void move() {
        System.out.println(CATFISH_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(CATFISH_KEY + name + " is swimming.");
    }
    @Override
    public void eat() {
        System.out.println(CATFISH_KEY + name + " is being eaten.");
    }

    @Override
    public void hunt() {
        System.out.println(CATFISH_KEY + name + " is hunting.");
    }

    @Override
    public void flee() {
        System.out.println(CATFISH_KEY + name + " is fleeing.");
    }
}
