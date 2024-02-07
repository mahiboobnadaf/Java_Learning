package Static;

public class StaticBlock {

    static int a=5;
    static int b;

    //will run only once when the class is loaded 
    static{
        System.out.println("I am in STATIC BLOCK");  //printed ony once when the class is loaded

        b=a*4;
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock(); //after first object is created 
        
        System.out.println(StaticBlock.a+ " "+StaticBlock.b );

        b+=5;
        System.out.println(StaticBlock.a+ " "+StaticBlock.b );
        
        StaticBlock obj2 = new StaticBlock();   //after second obj is created then also the staic block will print line once only
    
        System.out.println(StaticBlock.a+ " "+StaticBlock.b );
    
    }
    
}
