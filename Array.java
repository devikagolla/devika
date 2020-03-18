package array;
import java.util.Random;
public class Array {
    public static void main(String[] args) {
        Random r=new Random();
        int a[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt(10);
        }
        for(int i:a)
        {
            System.out.println(i);
        } 
        try
        {
            System.out.println(a[52]);
        }
        catch(Exception e)
        {
            System.out.println("Maximum size");
           
                }
    }
}
