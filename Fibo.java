package fibo; 
import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        int a=0,b=1,c=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.print(a+" "+b+" "); 
        while(c<=n)
        {
            c=a+b; 
            if(c>=n)
                break;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
  }
}
