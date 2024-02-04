
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter 1st.Float number and 2nd Integer Number");

        float num = inp.nextFloat();
        int no = inp.nextInt();

        System.out.println(num);
        System.out.println(no);


        // type casting
        int cast = (int)(67.56f);
        System.out.println(cast);


        // automatic type promotion in expressions
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

        inp.close();
    }
}