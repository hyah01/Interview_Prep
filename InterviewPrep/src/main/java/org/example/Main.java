package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog("Goldy");
//        Cat cat = new Cat("Moewsker");
//
//        Animal myDog = dog;
//        Animal myCat = cat;
//
//        myDog.sound();
//        myCat.sound();
//        myCat.sound("MEOW MEOW");
        System.out.println(method("Hello"));    }

    private static String method(String inpt){
        HashSet<Character> hset = new HashSet<>();
        String res = "";
        for (int i = 0; i < inpt.length(); i++){
            if (!(hset.contains(inpt.charAt(i)))){
                res = res + inpt.charAt(i);
                hset.add(inpt.charAt(i));
            }

        }
        return res;
    }


}