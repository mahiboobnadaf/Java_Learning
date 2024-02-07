package Static;

public class Main {
public static void main(String[] args) {

    Human mahiboob = new Human("mahiboob",23,24000);
    Human anil = new Human("anil",23,25000);
    
    
    System.out.println(mahiboob.population);
    System.out.println(anil.population);   // static value can also be accessed with object but it gives warning 

    System.out.println(Human.population);  //static variables should be with class name coz statics are independent of objects

}   
}
