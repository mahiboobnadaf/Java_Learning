package Objects.Copying_1_Objects_to_Others;

public class Via_Constructor {
    int id;
    String name;

    Via_Constructor(int i, String n){
        id=i;
        name=n;
        // System.out.println(id+","+name +" S1");
    }
    Via_Constructor(Via_Constructor s){   //pass the constructor as datatype from which you want to copy
        id=s.id;                           // access their values using . operator
        name=s.name;
        // System.out.println(id+","+name + " S2");

    }

    void display(){
        System.out.println(id+","+name);
    }

    public static void main(String[] args) {
        Via_Constructor s1 = new Via_Constructor(10,"mahiboob") ;
        Via_Constructor s2 = new Via_Constructor(s1);     //pass an object reference as parameter to s2 to copy s1 object
        s1.display();
        s2.display();

    }
}
