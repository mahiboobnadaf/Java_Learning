package Static;

//Static member can access only static data

// To access non static methods , we need a instance of class (object reference)

// But non static member can access static data with reference or without reference 
//- because static is independent of instances(object references) it can be called from anywhere 

//Non static members are dependent on instances of class


public class Accessing {
    //the main method is always static because where we run program it starts with main method and 
    //it does not require any instances to run , try to run program without main method you will get understand 

    // if main method was not static then to call main method it requires a instance ,but program itself will not show run option
    //if there is no static for main method
    
    
    public static void main(String[] args) { 
        // greeting();       // here greeting not accessible bcoz "this main method is static and greeting is non static method"

        
                      //for fun2() we need to create an instance 
        fun();
        Accessing obj1 = new Accessing();
        obj1.fun2(); 

        fun3();
    }


    static void fun(){
        // greeting();         //even a static method cannot access the non static method
    }

    void fun2(){
        greeting();  //here it can access non static method because this method is also non static , 
                    //this greeting does not require any individual instance to call greeting 
                    //rather it will the instance from which the fun2() is called 
    }

    //But there is a way to call a non static method from static ,method 
    static void fun3(){

        Accessing obj = new Accessing();
        obj.greeting();    //via creating an instance of class in static method we can access non static member
    }

    void greeting(){
        System.out.println("hey all");
    }

}
