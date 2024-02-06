package Objects.Copying_1_Objects_to_Others;

public class Without_Constructor {
    int id;
    String name;

    Without_Constructor(int i,String n){
        id=i;
        name=n;
    }

    Without_Constructor(){

    }

    void display(){
        System.out.println("id: "+id +" name: "+name);
    }

    public static void main(String[] args) {
        Without_Constructor s1 = new Without_Constructor(10,"Mahiboob");
        Without_Constructor s2 = new Without_Constructor();
        s1.display();
        // s2.display();  //initially default constructor will assign default values 

        s2.id=s1.id;        //asssigning(copying) id of s1 obj to id of s2 obj
        s2.name=s1.name;    //asssigning(copying) name of s1 obj to name of s2 obj

        s2.display();


    }
}
