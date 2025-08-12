package org.example;

public class Main {
    public static void main(String[] args) {
//        // Ex 1
//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();
//
//        Bicycle myBicycle = new Bicycle();
//        myBicycle.honk();
//        myBicycle.ringBell();

//        // Ex 2
//        Circle myCircle = new Circle();
//        System.out.println(myCircle.display());
//
//        Rectangle myRectangle = new Rectangle();
//        System.out.println(myRectangle.display());
//
//        Dog dog = new Dog();
//        dog.breathe();
//        dog.makeSound();

//        // Ex 3
//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor(); // Polymorphism
//
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();
//
        GameCharacter regular = new GameCharacter();
        int damageTaken = regular.takeDamage(100);
        System.out.println("Regular character takes " + damageTaken + " damage. New health: " + regular.health);
        ArmoredCharacter armored = new ArmoredCharacter();
        damageTaken = armored.takeDamage(100);
        System.out.println("Armored character takes " + damageTaken + " damage. New health: " + armored.health);


        // Ex 4
        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee();
    }
}