package Constructors;

public class ParameterizedConstruct_2 {
    int id;
    String name;
    
    ParameterizedConstruct_2(int rno , String Sname){
        id=rno;
        name=Sname;
    }

    void display(){
        System.out.println("name: "+name + " id: "+id);
    }

    public static void main(String[] args) {
        ParameterizedConstruct_2 s1 = new ParameterizedConstruct_2(10, "mahiboob");
        ParameterizedConstruct_2 s2 = new ParameterizedConstruct_2(20, "anil");

        s1.display();
        s2.display();
    }
}
