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
                System.out.print("Enter first number: ");
                Firstnum = s.nextInt();
                System.out.print("Enter second number: ");
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
                    Addnum(Firstnum, Secondnum);
                    break;

                case 2:
                    Subnum(Firstnum, Secondnum);
                    break;
 
                case 3:
                    Mulnum(Firstnum, Secondnum);
                    break;
 
                case 4:
                
                    Divnum(Firstnum, Secondnum);
                    break;    
 
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Enter a valid no.");
                    break;
            }
        }
    
    }

    public static void Addnum(int y, int z){
        int result = y+z;
        System.out.println("Result:"+result);  
    }

    public static void Subnum(int y, int z){
        int result = y-z;
        System.out.println("Result:"+result);  
    }

    public static void Mulnum(int y, int z){
        int result = y*z;
        System.out.println("Result:"+result);  
    }
    
    public static void Divnum(int y, int z){
        double result = (double)y / z;
        System.out.println("Result:"+result);  
    }

}
