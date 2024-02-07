package Packages.a;

import static Packages.b.Message.message;       //importing the package from where i need to call the method
import static Packages.a.Sms.brother;


public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to Greeting.java");
        brother();                              // calling a method from same folder but other file
        message();                              // Calling the method of other file
    }

}
