package prime; import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int flag=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Prime");
        else
            System.out.println("not a prime");
    }
    
}
