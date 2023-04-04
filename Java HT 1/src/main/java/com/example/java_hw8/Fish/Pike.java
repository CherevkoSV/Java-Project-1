package com.example.java_hw8.Fish;

class Pike extends Fish implements Edible {
    public Pike(String name, int length, int age) {
        super(name, length, age);
    }

    private static final String PIKE_KEY = "Pike ";

    @Override
    public void makeSound() {
        System.out.println(PIKE_KEY + name + " is silent.");
    }
    @Override
    public void move() {
        System.out.println(PIKE_KEY + name + " is moving.");
    }
    @Override
    public void swim() {
        System.out.println(PIKE_KEY + name + " is swimming.");
    }
    @Override
    public void eat() {
        System.out.println(PIKE_KEY + name + " is eaten.");
    }
    @Override
    public void hunt() {
        System.out.println(PIKE_KEY + name + " is hunting.");
    }
    @Override
    public void flee() {
        System.out.println(PIKE_KEY + name + " is fleeing.");
    }
}
