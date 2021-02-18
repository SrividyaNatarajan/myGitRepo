import java.util.Scanner;
import javax.lang.model.util.ElementScanner6;
import java.util.InputMismatchException;
import java.io.*;
public class Calculatorp {
    public static void main(String[] args) {
        
        int Firstnum, Secondnum, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
      
        boolean bError = true;
        Firstnum=0;Secondnum=0;
        do {
            try {
                System.out.print("Enter first num: ");
                Firstnum = s.nextInt();
                System.out.print("Enter second num: ");
                Secondnum = s.nextInt();
                bError = false;
            } 
            catch (Exception e) {
                System.out.println("Enter only numbers");
                System.exit(0);
            }
        } while (bError);

        
        //System.out.print("Enter first number here:");

          //  m = s.nextInt();
            
        //System.out.print("Enter second number here:");
          //  n = s.nextInt();
        
                
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
         
                opt = s.nextInt();
                
                     
            switch(opt)
            {
                case 1:
                    add = Firstnum + Secondnum;
                    System.out.println("Result:"+add);
                    break;
                

                case 2:
                sub = Firstnum - Secondnum;
                System.out.println("Result:"+sub);
                break;
 
                case 3:
                mul = Firstnum * Secondnum;
                System.out.println("Result:"+mul);
                break;
 
                case 4:
                
                div = (double)Firstnum / Secondnum;
                System.out.println("Result:"+div);
                break;    
 
                case 5:
                System.exit(0);

                default:
                System.out.println("Enter a valid no.");
                break;
            }
        }
        
    
    }
}
