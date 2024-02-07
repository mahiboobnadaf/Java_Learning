package Static;

public class Human {
    String name;
    int age;
    float salary;
    static long population;         //its static because population for every human is same so it can be used as static

    public Human(String name,int age,float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        Human.population+=1;        //using this.population is also fine but not a good convention for static it should be accessed with class name  
    }
}
