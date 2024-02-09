package Inheritance;

    class Animal{
        void eat(){
            System.out.println("Animal eat food");
        }
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("Dog barks");
        }
    }

    class BabyDog extends Dog{
        void weep(){
            System.out.println("Baby dog is weeping");
        }
    }

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.bark();
        d.eat();
        d.weep();
    
}
}