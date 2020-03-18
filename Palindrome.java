package palindrome;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) { 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Palindrome Number");
    else
            System.out.println(" Not a Palindrome Number");
    }
    
}
