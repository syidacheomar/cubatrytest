//used interface when we want to have multiple function/variable implement in a single class

interface Animal{
    void sound();
}

interface Playable{
    void play();
}

class Dog implements Animal, Playable {
    @Override
    public void sound(){
        System.out.println("bark");
    }
    @Override
    public void play(){
    System.out.println("Dog is playing ");
}
}

public class InterfaceSample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.play();
    }
}
