package org.example;

class GameCharacter {
    int health = 100;
    public void takeDamage(int amount){
        health -= amount;
        System.out.println("Regular character takes " + amount + " damage. New health: " + health);
    }
}

class ArmoredCharacter extends GameCharacter{
    @Override
    public void takeDamage(int amount){
        int newAmount = amount/2;
        health -= newAmount;
        System.out.println("Armored character takes " + newAmount + " damage. New health: " + health);

    }
}
