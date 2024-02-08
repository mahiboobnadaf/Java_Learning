public class ConstructorStatic {

String name;
int roll;
    static ConstructorStatic(String n,int r){ //Constructor cannot be static type
        name=n;
        roll=r;
    }
    public static void main(String[] args) {
        ConstructorStatic obj = new ConstructorStatic("mahiboob",20);
        System.out.println(obj.name);
    }

}
