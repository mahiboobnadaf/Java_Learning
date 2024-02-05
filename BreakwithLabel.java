//Java Program to illustrate the use of continue statement  
//with label inside an inner loop to break outer loop  
public class BreakwithLabel {  
public static void main(String[] args) {  
            aa:             //label 
            for(int i=1;i<=3;i++){    
                    bb:         //label
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement with label. Default(without label) break for nested loops will be innermost loop
                            break aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    

// following will break only inner loop where if condition is true 

            // aa:             //label 
            // for(int i=1;i<=3;i++){    
            //         bb:         //label
            //         for(int j=1;j<=3;j++){    
            //             if(i==2&&j==2){    
            //                 //using break statement with label  
            //                 break bb;    
            //             }    
            //             System.out.println(i+" "+j);    
            //         }    
            // }    
}  
}  