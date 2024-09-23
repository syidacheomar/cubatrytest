//want to use the same f(x)
//Super class

class Animal{
    public void sound(){
        System.out.println("Hop Hop");
    }
}

//Subclass number 1
//need to use override bcs the f(x) is same, it might be confused if we didnt put it

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

//Subclass number 2

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

public class Polymorphism{

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new Cat();
        myAnimal.sound();
    }
}
