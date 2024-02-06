package Constructors;


// Constructor overloading- in which there will be same constructor name but differ in parameter list 
public class ConstructorOverloading {
    int id;
    String name;
    int age;
    String address;
    ConstructorOverloading(int i,String n){
        id=i;
        name=n;
    }

    ConstructorOverloading(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }

    ConstructorOverloading(int i,String n,int a,String location){
        id=i;
        name=n;
        age=a;
        address=location;
    }
    void display(){
        System.out.println("student id:" +id + " name: " +name  + " age:" +age + " address: " +address);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading(10,"Mahiboob");
        ConstructorOverloading s2 = new ConstructorOverloading(20,"Rasool",24);
        ConstructorOverloading s3 = new ConstructorOverloading(30,"Anil",23,"Hubli");

        s1.display();
        s2.display();
        s3.display();
        
    }
}
