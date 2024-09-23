public class Encapsulation { // encap is to access something inside the code
    
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();
        person.setName("Syida");
        person.setAge(24);
        System.out.println(person.getName() + " " + "is" + " " + person.getAge() + " " + "years old");
    }
}
