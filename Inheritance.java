//allow all method and variables from one class (super) to be accesible by another class (sub)
//super class - the class being inherited from

class Animal {
    public void eat(){
        System.out.println("The animal is eating");
    }
}

//subclass - the class that inherit from another class

class Dog extends Animal{
    public void bark(){
        System.out.println("The dog is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
    
}
