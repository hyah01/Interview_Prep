package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Goldy");
        Cat cat = new Cat("Moewsker");

        Animal myDog = dog;
        Animal myCat = cat;

        myDog.sound();
        myCat.sound();
        myCat.sound("MEOW MEOW");
    }


}