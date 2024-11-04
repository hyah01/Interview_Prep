package org.example;

abstract class Animal {
    private String name; // Encapsulation

    public Animal(String name){
        this.name = name;
    }

    public abstract void sound(); // Abstraction
    public abstract void sound(String inpt);
}





