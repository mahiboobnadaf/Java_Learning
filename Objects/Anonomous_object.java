package Objects;


class greeting{
    void message(String name){
        System.out.println("Hello ! "+name);
    }
}
public class Anonomous_object {
    public static void main(String[] args) {
        new greeting().message("mahiboob");  //Anonomous Object creating new class_name(); 
    }
}
