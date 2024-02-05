package Objects;


class Student {
    int rollno;
    String name;

    void insert(int rno,String n){
        rollno = rno;
        name = n;
    }

    void display(){
        System.out.println("Roll no : "+ rollno +"\t Name :"+name );
    }


    
}
public class TestStudent1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        // System.out.printf("%d\n",12);
        s1.insert(10, "Mahiboob");
        s2.insert(20, "nadaf");
        s1.display();
        s2.display();
    }
}
