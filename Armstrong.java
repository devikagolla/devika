package armstrong; 
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int c=0,temp=n,sum=0;
        while(temp>0)
        { 
            temp=temp/10;
            ++c;
        } 
        temp=n;
        while(temp>0)
        {
            int rem=temp%10;
            sum=sum+pow(rem,c); 
            temp=temp/10;
        }
        if(n==sum)
            System.out.println("Armstrong Number");
            else
                System.out.println("NOT");
        
    }
    public static int pow(int rem,int c)
    {
        int s=1;
        for(int i=0;i<c;i++)
        {
           s=s*rem;
        } 
        return s;
    }
        
    }
