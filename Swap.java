package swap;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        b=a+b-(a=b);
        System.out.println(a+" "+b);
    }
    
}
