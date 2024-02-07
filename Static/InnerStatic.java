package Static;


//Only inner classes can have static ,, outer class cannot be static

public class InnerStatic {

    
    // class Test1{
    //     String name;
    //     public Test1(String name){
    //         this.name=name;                          //will show eroor because now Test1 is dependent on Innerstatic class
    //     }
    // }

    static class Test1{
        String name;
        public Test1(String name){
            this.name=name;
        }
    }


    public static void main(String[] args) {
        Test1 obj1 = new Test1("Mahiboob");
        Test1 obj2 = new Test1("Anil");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
    
}
