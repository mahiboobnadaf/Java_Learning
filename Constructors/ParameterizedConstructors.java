package Constructors;

public class ParameterizedConstructors {

    int id;
    String name;
    ParameterizedConstructors(int rno,String naam){
        id=rno;
        name=naam;
        System.out.println("name: "+naam + " id: "+rno +" From object 1 "); //print 2times for 2 objects bcoz we are passing params to constructors and prnting it below
    }

    void display(){
        System.out.println("name: "+name + " id: "+id + " From Object 2 ");
    }

    public static void main(String[] args) {
        ParameterizedConstructors s1 = new ParameterizedConstructors(11, "Mahiboob");  //passing values to parameterized constructor
        ParameterizedConstructors s2 = new ParameterizedConstructors(22, "Nadaf");  //passing values to parameterized constructor
        
        s2.display();
    }
}
