package tcthrow;

import java.io.IOException;
import java.util.Scanner;

public class TCThrow {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int k=0;
        int c[]=new int[5];
        try
        {
            k=b/a;
            if(k==a)
            {
                throw new ArithmeticException();
            }
            System.out.println(k);
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Minimun Requirement");
        }
        finally
        {
            System.out.println("This is devika program");
        }    
    }
    
}
