//casting - we want both super class and sub class together 

//Super class

class Animal {
    public void sound(){
        System.out.println("Default");
    }
}

// Subclass #1
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barks");
    }
}

public class Casting {
    
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        if (myAnimal instanceof Dog){   //instanceof = part of
            Dog myDog = (Dog) myAnimal;
            myDog.bark();
        }
    }
}
