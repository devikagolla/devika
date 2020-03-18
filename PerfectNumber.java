package perfectnumber; 
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean a=isPerfect(n);
        if(a)
            System.out.println("Palindrome Number");
            else
            System.out.println("NOt");
    }
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
           if(n%1==0)
               sum=sum+i;
        } if(sum==n)
            return true;
            else
            return false;
        }
}
