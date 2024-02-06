package Constructors;
public class DefaultConstructor2 {
    int id;
    String name;
    
    DefaultConstructor2(){
        System.out.println("id: "+id + " name: "+name);    //will assign the default values for id and name (0 and null)..
    }

    public static void main(String[] args) {
        DefaultConstructor2 d2 = new DefaultConstructor2();
    }
}
