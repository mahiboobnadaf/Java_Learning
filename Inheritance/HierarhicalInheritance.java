package Inheritance;

class Animal{
    void eat(){
        System.out.println("All animals eat");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meoooownnnn... Meoooownnnn... ");
    }
}

public class HierarhicalInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
        // c.bark(); // Compile time Error becaouse cat class inherits Animal not Dog class.
}
}