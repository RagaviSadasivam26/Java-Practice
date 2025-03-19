public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}

class Animal{
    String name;
    int age;

    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}