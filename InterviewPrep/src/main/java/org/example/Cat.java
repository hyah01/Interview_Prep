package org.example;

class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }

    @Override
    public void sound(String inpt){
        System.out.println(inpt);
    }
}
