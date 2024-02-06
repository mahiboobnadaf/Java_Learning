package Constructors;

public class ParameterizedConstructors {
    ParameterizedConstructors(int rno,String name){
        System.out.println("name: "+name + " id: "+rno);
    }

    public static void main(String[] args) {
        ParameterizedConstructors s1 = new ParameterizedConstructors(11, "Mahiboob");  //passing values to parameterized constructor
    }
}
