package org.example;

abstract class Animal {
    // Concrete Method
    public void breathe(){
        System.out.println("Inhale... Exhale...");
    }

    // Abstract Method
    abstract public void makeSound();
}

class Dog extends Animal {
    public void makeSound(){
        System.out.println("Woof!");
    }
}
