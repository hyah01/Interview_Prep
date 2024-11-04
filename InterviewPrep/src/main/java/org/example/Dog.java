package org.example;

// Inheritance
class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    // Polymorphism : method overriding
    @Override
    public void sound(){
        System.out.println("Bark Bark");
    }

    // Polymorphism : Overloading
    @Override
    public void sound(String inpt){
        System.out.println(inpt);
    }
}
