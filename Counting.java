import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        try{
            System.out.println("Enter a count number upto which you want to count:"); 
            int count = input.nextInt();
            int i=0;
            int sum=0;


            while (i<=count){
                System.out.println("count:"+i);
                i++;
            }
        // Sum of first 10 natura numbers
            for(int j=1;j<=10;j++){
                System.out.println(sum);
                sum+=j;
                System.out.println("Sum:"+sum);
            }
        }
        finally{
            input.close();
        }

    }
    
}
