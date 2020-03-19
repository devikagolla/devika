package trycat;

import java.util.Scanner;

public class TryCat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int k=0;
        int c[]=new int[5];
        try
        {
            k=a/b;
            System.out.println(k);
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Wrong");
        }
        finally
        {
            System.out.println("This is devika program");
        }    
        }
}
