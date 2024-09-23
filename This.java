//want to declare variable and keep it forever so we used "super"

//super class
class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void sound(){
        System.out.println(name + " makes a sound");
    }
}

//subclass #1

class Dog extends Animal{
    public Dog(String name){
        super(name); // it fetch represnt to this.name = name
    }
    @Override
    public void sound(){
        super.sound();
        System.out.println(name + " barks ");
    }
}

public class This {
    
    public static void main(String[] args) {
        Dog dog = new Dog("Puppy");
        dog.sound();
    }
}
