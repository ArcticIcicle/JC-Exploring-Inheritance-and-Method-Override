package org.example;

class GameCharacter {
    int health = 100;
    public int takeDamage(int amount){
        this.health -= amount;
        return amount;
    }
}

class ArmoredCharacter extends GameCharacter{
    public int takeDamage(int amount){
        int newAmount = amount/2;
        super.takeDamage(newAmount);
        return newAmount;
    }
}
