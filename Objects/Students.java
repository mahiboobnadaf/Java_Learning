package Objects;

public class Students {
    int id;
    String name;
    public static void main(String[] args) {
        //creating object or instance
        Students s1 = new Students(); //creating object of student

        System.out.println(s1.id); // when empty default valueof primitive datatype will be 0
        System.out.println(s1.name);  // string type is Non-primitive so default value is null
    
        Students s2 = new Students();
        s2.name = "mahiboob";
        s2.id = 012;
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}
