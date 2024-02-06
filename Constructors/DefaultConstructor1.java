package Constructors;

public class DefaultConstructor1 {

    DefaultConstructor1(){  //constrctor_name should be same as class_name.
        System.out.println("Hello i am Defaut Constructor! bCoz i dont have any parameter");
    }

    public static void main(String[] args) {
        DefaultConstructor1 d = new DefaultConstructor1();   //while creating object, it will automatically calls a default constructor
    }
}
